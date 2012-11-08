/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.miras;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author usta
 */
@Entity
@Table(name="CD5_Tablo")
public class CD5 extends Urun5{
    
    private String produksiyon;
    private Integer parcaSayisi;
    private Float toplamSure;
    private String tur;

    public CD5() {
    }

    public CD5(String produksiyon, Integer parcaSayisi, Float toplamSure, String tur, String urunAdi, Double fiyat, String aciklama) {
        super(urunAdi, fiyat, aciklama);
        this.produksiyon = produksiyon;
        this.parcaSayisi = parcaSayisi;
        this.toplamSure = toplamSure;
        this.tur = tur;
    }

    public Integer getParcaSayisi() {
        return parcaSayisi;
    }

    public void setParcaSayisi(Integer parcaSayisi) {
        this.parcaSayisi = parcaSayisi;
    }

    public String getProduksiyon() {
        return produksiyon;
    }

    public void setProduksiyon(String produksiyon) {
        this.produksiyon = produksiyon;
    }

    public Float getToplamSure() {
        return toplamSure;
    }

    public void setToplamSure(Float toplamSure) {
        this.toplamSure = toplamSure;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
    
    
    
}
