/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author usta
 */
@ManagedBean(name="bean")
public class JSFManagedBean {
    
    @EJB
    StatelessEJB isci;
    
    Kitap kitap=new Kitap();
    List<Kitap> kitaplar;
    
    public void kaydet(){
        isci.kitapEkle(kitap);
    }

    public List<Kitap> getKitaplar() {
        return isci.tumKitaplar();
    }

    public void setKitaplar(List<Kitap> kitaplar) {
        this.kitaplar = kitaplar;
    }


    public StatelessEJB getIsci() {
        return isci;
    }

    public void setIsci(StatelessEJB isci) {
        this.isci = isci;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }
    

}
