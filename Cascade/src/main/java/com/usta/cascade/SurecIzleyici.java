/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cascade;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 *
 * @author usta
 */
public class SurecIzleyici {
    
    @PrePersist
    public void KaydetmedenOnce(Object o)  {
        
        Urun saglayici;
        System.out.println("Kaydetmeden önce");
        
      //  if(o instanceof Saglayici)
       
            saglayici=(Urun)o;
             //   if(saglayici.getSirketAdi().contains("A.Ş."))
               //     saglayici.setSirketAdi(saglayici.getSirketAdi()+" A.Ş.");
            
        
    }

    @PreUpdate
    public void GuncellemedenOnce(Object o) {
        System.out.println("GuncellemedenOnce");

    }

    @PreRemove
    public void SilmedenOnce(Object o) {
        System.out.println("SilmedenOnce");
    }

    @PostLoad
    public void YuklendiktenSonra(Object o) {
        System.out.println("YuklendiktenSonra");

    }

    @PostPersist
    public void KaydetmedenSonra(Object o) {

        System.out.println("Kaydettikten sonra");
    }

    @PostUpdate
    public void GuncellemedenSonra(Object o) {
        System.out.println("GuncellemedenSonra");

    }

    @PostRemove
    public void SilmedenSonra(Object o) {
        System.out.println("SilmedenSonra");
    }
    
}
