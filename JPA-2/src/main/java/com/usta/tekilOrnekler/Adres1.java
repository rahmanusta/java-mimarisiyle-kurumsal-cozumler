package com.usta.tekilOrnekler;

import java.io.Serializable;
import javax.persistence.*;

@Entity
//@Table(name = "Adres1_Tablo") // ifadesi tablo adını biçimlendirir.
@SecondaryTables({ // Adres1 entity'sini tablolara ayırır.
        @SecondaryTable(name = "Adres1_Sehir"), // Ayrım tablosu 1
        @SecondaryTable(name = "Adres1_Ulke"), // Ayrım tablosu 2
        @SecondaryTable(name = "Adres1_Sokak") // Ayrım tablosu 3
})
public class Adres1 implements Serializable {

    // ====================================
    // =      Entity sınıf alanları       =
    // ====================================
    @Id
    private Long id;
    @Column(table = "Adres1_Sokak")
    private String sokak1;
    @Column(table = "Adres1_Sokak")
    private String sokak2;
    @Column(table = "Adres1_Sehir")
    private String sehir;
    @Column(table = "Adres1_Sehir")
    private String bolge;
    @Column(table = "Adres1_Sehir")
    private String postaKodu;
    @Column(table = "Adres1_Ulke")
    private String ulke;

    public Adres1() {
    }

    public Adres1(String sokak1, String sokak2, String sehir, String bolge, String postaKodu, String ulke) {
        this.sokak1 = sokak1;
        this.sokak2 = sokak2;
        this.sehir = sehir;
        this.bolge = bolge;
        this.postaKodu = postaKodu;
        this.ulke = ulke;
    }
    
    

    public String getBolge() {
        return bolge;
    }

    public void setBolge(String bolge) {
        this.bolge = bolge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(String postaKodu) {
        this.postaKodu = postaKodu;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getSokak1() {
        return sokak1;
    }

    public void setSokak1(String sokak1) {
        this.sokak1 = sokak1;
    }

    public String getSokak2() {
        return sokak2;
    }

    public void setSokak2(String sokak2) {
        this.sokak2 = sokak2;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    
}