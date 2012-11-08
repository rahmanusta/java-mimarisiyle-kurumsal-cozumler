/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.miras;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author usta
 */
@Entity
@Table(name="Kitap_Tablo")
public class Kitap extends Urun {
    
    private String isbn;
    private String yayinevi;
    private String sayfaSayisi;

    public Kitap() {
    }

    public Kitap(String isbn, String yayinevi, String sayfaSayisi, String urunAdi, Double fiyat, String aciklama) {
        super(urunAdi, fiyat, aciklama);
        this.isbn = isbn;
        this.yayinevi = yayinevi;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(String sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }
    
    
    
}
