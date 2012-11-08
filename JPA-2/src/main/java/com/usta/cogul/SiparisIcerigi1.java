/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cogul;

import javax.persistence.*;

/**
 *
 * @author usta
 */
@Entity
@Table(name="SiparisIcerigi1_Tablo")
public class SiparisIcerigi1{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String urun;
    private Double fiyat;
    private Integer miktar;

    public SiparisIcerigi1() {
    }

    public SiparisIcerigi1(String urun, Double fiyat, Integer miktar) {
        this.urun = urun;
        this.fiyat = fiyat;
        this.miktar = miktar;
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

    public Integer getMiktar() {
        return miktar;
    }

    public void setMiktar(Integer miktar) {
        this.miktar = miktar;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }  
    
    
}
