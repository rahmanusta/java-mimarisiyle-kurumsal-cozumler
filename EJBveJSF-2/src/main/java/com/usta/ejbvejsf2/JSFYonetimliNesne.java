/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf2;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author usta
 */
@ManagedBean(name="bean")
@RequestScoped
public class JSFYonetimliNesne {
    
    public JSFYonetimliNesne(){
        System.out.println("Yönetimli nesne çalıştı");
    }

   @EJB
   AlisverisSepetiEJB alisverisSepeti;
   
   Urun urun=new Urun();
   List<Urun> urunler;


    public List<Urun> getUrunler() {
        return alisverisSepeti.getUrunler();
    }

    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }
    
    public void sepeteKoy(){
        alisverisSepeti.urunEkle(urun);
        urun=new Urun();


    }

}
