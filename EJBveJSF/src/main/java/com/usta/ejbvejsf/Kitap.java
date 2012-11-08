/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author usta
 */
@Entity
@NamedQuery(name="tumKitaplar",query="select k from Kitap k")
public class Kitap {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String kitapAdi;
    private Float fiyat;
    @Column(length=1000)
    private String aciklama;
    private Integer sayfaSayisi;

    public Kitap() {
    }

    public Kitap(String kitapAdi, Float fiyat, String aciklama, Integer sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Float getFiyat() {
        return fiyat;
    }

    public void setFiyat(Float fiyat) {
        this.fiyat = fiyat;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public Integer getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(Integer sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
      @Override
    public String toString() {
        return "Kitap{" + "id=" + id 
                + ", kitapAdi=" + kitapAdi + 
                ", fiyat=" + fiyat + 
                ", aciklama=" + aciklama +
                ", sayfaSayisi=" + sayfaSayisi + '}';
    }  
    
}
