package com.usta.cogul;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "Musteri3_Tablo")
public class Musteri3 implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String ad;
    private String soyad;
    private String email;
    private String telNo;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adres_katilim_tablosu", nullable = false)
    private Adres3 adres;

    public Musteri3() {
    }

    public Musteri3(String ad, String soyad, String email, String telNo, Adres3 adres) {
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

    public Adres3 getAdres() {
        return adres;
    }

    public void setAdres(Adres3 adres) {
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
