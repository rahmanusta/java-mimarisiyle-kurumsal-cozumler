/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.evredinleyici;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author usta
 */

@ManagedBean(name="uye")
@SessionScoped
public class Uye {

    public Uye() {
    }
   
    private String uyeAdi;
    private String uyeSifre;

    public Uye(String uyeAdi, String uyeSifre) {
        this.uyeAdi = uyeAdi;
        this.uyeSifre = uyeSifre;
    }

    public String getUyeAdi() {
        return uyeAdi;
    }

    public void setUyeAdi(String uyeAdi) {
        this.uyeAdi = uyeAdi;
    }

    public String getUyeSifre() {
        return uyeSifre;
    }

    public void setUyeSifre(String uyeSifre) {
        this.uyeSifre = uyeSifre;
    }
    
        @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (this.uyeAdi != null ? this.uyeAdi.hashCode() : 0);
        hash = 43 * hash + (this.uyeSifre != null ? this.uyeSifre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Uye other = (Uye) obj;
        if ((this.uyeAdi == null) ? (other.uyeAdi != null) : !this.uyeAdi.equals(other.uyeAdi)) {
            return false;
        }
        if ((this.uyeSifre == null) ? (other.uyeSifre != null) : !this.uyeSifre.equals(other.uyeSifre)) {
            return false;
        }
        return true;
    }
    
    
}
