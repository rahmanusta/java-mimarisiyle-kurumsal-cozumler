/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.jsfuygulamasi;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author usta
 */
@ManagedBean(name = "bean")
public class KitapKontrolor {

    @EJB
    private KitapEJB kitapEJB;
    
    private Kitap kitap = new Kitap();
    private List<Kitap> kitapListesi = new ArrayList<Kitap>();

    public String kitapOlustur() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (kitap.getFiyat() == null || kitap.getFiyat().toString().equals("")) {
            context.addMessage("fiyat", new FacesMessage("Fiyat bilgisi doldurulmak zorunda!"));
            return null;
        } else {
   
            try {
            kitap = kitapEJB.kitapEkle(kitap);
            kitapListesi = kitapEJB.tumKitaplariBul();
            
                context.addMessage(null, new FacesMessage("Ürün başarıyla sepete eklendi.."));
            } catch (Exception e) {
                context.addMessage(null, new FacesMessage("Ürün sepete eklenirken hatayla karşılaşıldı.."));
            }
            return "listele.xhtml";

        }

    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public List<Kitap> getKitapListesi() {
        return kitapListesi;
    }

    public void setKitapListesi(List<Kitap> kitapListesi) {
        this.kitapListesi = kitapListesi;
    }
}