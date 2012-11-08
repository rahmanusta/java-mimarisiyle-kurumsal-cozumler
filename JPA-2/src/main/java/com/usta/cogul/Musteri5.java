package com.usta.cogul;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Musteri5_Tablo")
public class Musteri5 implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String ad;
    private String soyad;
    private String email;
    private String telNo;


    @OneToOne(cascade= CascadeType.ALL)
    private Adres5 adres;

    public Musteri5() {
    }

    public Musteri5(String ad, String soyad, String email, String telNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telNo = telNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Adres5 getAdres() {
        return adres;
    }

    public void setAdres(Adres5 adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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