/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author usta
 */
@ManagedBean(name="erisilen")
@NoneScoped
public class Erisilen {
    
    private String ad;
    private String soyad;
    
    @PostConstruct // Yönetimli nesne oluşturulduktan hemen sonra..
    public void hemenSonra(){
        this.ad="Burak";
        this.soyad="Tunalı";
    }
    
    @PreDestroy // Yönetimli nesne yok edilmeden hemen önce..
    public void hemenOnce(){
        this.ad=null;
        this.soyad=null;
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
       
}