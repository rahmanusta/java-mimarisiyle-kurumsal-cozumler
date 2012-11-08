/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf2;

/**
 *
 * @author usta
 */
public class Urun {
    
   String urunAdi;
   Double fiyat;
   Long gramaj;

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Long getGramaj() {
        return gramaj;
    }

    public void setGramaj(Long gramaj) {
        this.gramaj = gramaj;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
   
}
