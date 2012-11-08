/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf3;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

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

        FacesContext context=FacesContext.getCurrentInstance();
        
        if(urun.fiyat==null || urun.fiyat.toString().equals(""))
        context.addMessage("fiyat",new FacesMessage("Fiyat bilgisi doldurulmak zorunda!"));
        else
        {
        alisverisSepeti.urunEkle(urun);
        urun=new Urun();   
            
        try {
            context.addMessage(null, new FacesMessage("Ürün başarıyla sepete eklendi.."));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage("Ürün sepete eklenirken hatayla karşılaşıldı.."));
        }

        }
    }

}
