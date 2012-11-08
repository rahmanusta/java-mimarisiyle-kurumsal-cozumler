/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cascade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author usta
 */
@Entity
public class Kategori {
    
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long kategoriId;
    private String kategori;

    public Long getKategoriId() {
        return kategoriId;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
}
