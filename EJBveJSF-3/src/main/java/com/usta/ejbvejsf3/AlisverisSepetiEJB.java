/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;

/**
 *
 * @author usta
 */

@Stateful
@Interceptors(Kesici.class)
public class AlisverisSepetiEJB {
    
    List<Urun> urunler=new ArrayList<Urun>();

    public List<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }
    
    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
 
    
}
