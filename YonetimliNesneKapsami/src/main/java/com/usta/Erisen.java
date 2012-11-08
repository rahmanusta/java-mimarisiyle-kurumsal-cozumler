/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author usta
 */
@ManagedBean(name="erisen")
@SessionScoped
public class Erisen {
    
    private String mesaj;
    
    @ManagedProperty(value="#{erisilen}")
    private Erisilen erisilen;

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public Erisilen getErisilen() {
        return erisilen;
    }

    public void setErisilen(Erisilen erisilen) {
        this.erisilen = erisilen;
    }
   
    
    public void selamla(){
        
        mesaj="Hoşgeldin "+erisilen.getAd()+" "+erisilen.getSoyad();
        
    }
    
}
