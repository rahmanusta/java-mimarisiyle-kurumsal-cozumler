package com.usta.cogul;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Adres3_Tablo") // ifadesi tablo adını biçimlendirir.
public class Adres3 implements Serializable {

    @Id
    private Long id;
    private String sokak1;
    private String sokak2;
    private String sehir;
    private String bolge;
    private String postaKodu;
    private String ulke;

    public Adres3() {
    }

    public Adres3(Long id, String sokak1, String sokak2, String sehir, String bolge, String postaKodu, String ulke) {
        this.id = id;
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