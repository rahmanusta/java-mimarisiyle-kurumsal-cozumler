/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author usta
 */
@Entity

public class Urun {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long urunId;
    private String urunAdi;
    @OneToOne(cascade= CascadeType.ALL)
    // @OneToOne(cascade= CascadeType.PERSIST)
//     @OneToOne(cascade= CascadeType.MERGE)
//     @OneToOne(cascade= CascadeType.REMOVE)
//     @OneToOne(cascade= CascadeType.DETACH)
//     @OneToOne(cascade= CascadeType.REFRESH)

    private Kategori kategori;

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }


    public Long getUrunId() {
        return urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
   
    
}
