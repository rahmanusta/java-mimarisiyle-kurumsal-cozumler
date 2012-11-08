/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.miras;

import javax.persistence.*;

/**
 *
 * @author usta
 */
@Entity
@Table(name="Urun_Tablo")
public class Urun  {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String urunAdi;
    @Column(nullable=false)
    private Double fiyat;
    private String aciklama;

    public Urun() {
    }

    public Urun(String urunAdi, Double fiyat, String aciklama) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
    }

    
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    
    
    
    
    
}
