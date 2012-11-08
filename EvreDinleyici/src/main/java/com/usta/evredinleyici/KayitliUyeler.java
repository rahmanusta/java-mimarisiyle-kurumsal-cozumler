package com.usta.evredinleyici;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usta
 */
public class KayitliUyeler implements Serializable{
    
    private static KayitliUyeler kayitliUyeler=new KayitliUyeler();
    
    public Set<Uye> uyeler=new HashSet<Uye>();
    
    private KayitliUyeler(){
        uyeler.add(new Uye("usta","123"));  
        uyeler.add(new Uye("hakdogan","1234"));
        uyeler.add(new Uye("altuga","12345"));
        uyeler.add(new Uye("hakanozler","123456"));
    }

    public static synchronized KayitliUyeler nesneOlustur() {

        return kayitliUyeler;

    }
    

    public Set<Uye> getUyeler() {
        return uyeler;
    }

    public void setUyeler(Set<Uye> uyeler) {
        this.uyeler = uyeler;
    }
  
    
}
