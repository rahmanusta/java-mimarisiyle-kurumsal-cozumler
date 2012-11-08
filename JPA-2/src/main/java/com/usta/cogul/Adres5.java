package com.usta.cogul;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Adres5_Tablo") // ifadesi tablo adını biçimlendirir.
public class Adres5 implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String sokak1;
    private String sokak2;
    private String sehir;
    private String bolge;
    private String postaKodu;
    private String ulke;
    @OneToOne(mappedBy = "adres",cascade= CascadeType.ALL)
    private Musteri5 musteri;
 

    public Musteri5 getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri5 musteri) {
        this.musteri = musteri;
    }

    public Adres5() {
    }

    public Adres5(String sokak1, String sokak2, String sehir, String bolge, String postaKodu, String ulke) {
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