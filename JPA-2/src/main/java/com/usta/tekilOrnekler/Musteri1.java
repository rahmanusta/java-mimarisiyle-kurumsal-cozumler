package com.usta.tekilOrnekler;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "Musteri1_Tablo")
public class Musteri1 implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String ad;
    private String soyad;
    private String email;
    private String telNo;
    @Temporal(TemporalType.DATE)
    private Date dogumTarihi;
    @Transient
    private Integer yas;
    @Temporal(TemporalType.TIMESTAMP)
    private Date olusturmaZamani;

    public Musteri1() {
    }

    public Musteri1(Long id, String ad, String soyad, String email, String telNo, Date dogumTarihi, Integer yas, Date olusturmaZamani) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telNo = telNo;
        this.dogumTarihi = dogumTarihi;
        this.yas = yas;
        this.olusturmaZamani = olusturmaZamani;
    }

    
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
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

    public Date getOlusturmaZamani() {
        return olusturmaZamani;
    }

    public void setOlusturmaZamani(Date olusturmaZamani) {
        this.olusturmaZamani = olusturmaZamani;
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

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

 
    
}
