package com.usta.cogul;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Musteri2_Tablo")
public class Musteri2 implements Serializable {


    @Id
    @GeneratedValue
    private Long id;
    private String ad;
    private String soyad;
    private String email;
    private String telNo;
    private Adres2 adres;

    public Musteri2() {
    }

    public Musteri2(Long id, String ad, String soyad, String email, String telNo, Adres2 adres) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telNo = telNo;
        this.adres = adres;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Adres2 getAdres() {
        return adres;
    }

    public void setAdres(Adres2 adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    
}
