/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.jsfuygulamasi;

import javax.persistence.*;

/**
 *
 * @author usta
 */
@Entity
@NamedQuery(name="tumKitaplar",query="SELECT k FROM Kitap k")
public class Kitap {
    
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;
  @Column(nullable=false)
  private String adi;
  private Double fiyat;
  @Column(length=500)
  private String aciklama;
  private Integer sayfaSayisi;
  private String isbn;
  private String yazar;


    public Kitap() {
    }

    public Kitap(String adi, Double fiyat, String aciklama, Integer sayfaSayisi, String isbn, String yazar) {
        this.adi = adi;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
        this.sayfaSayisi = sayfaSayisi;
        this.isbn = isbn;
        this.yazar = yazar;
    }
 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(Integer sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
        public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    
    
}