/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 *
 * @author usta
 */

// @Stateless
// @Singleton
@Stateful
public class CagriEJB {
    
    @PostConstruct
    public void olusturulduktanSonra(){
        
        System.out.println("EJB nesnesi oluşturuldu..");
        
    }
    
    @PreDestroy
    public void sonlandirilmadanOnce(){
        
        System.out.println("EJB nesnesi birazdan yok olacak..");
        
    }
    
    @PrePassivate // Stateful ile anlamlı, diğerlerinde işlemez
    public void kaydedilmedenOnce(){
        
        System.out.println("Birazdan geçici olarak disk ortamına kayıt edilecek..");
        
    }
    
    @PostActivate // Stateful ile anlamlı, diğerlerinde işlemez
    public void geriGetirildiktenSonra(){
        
        System.out.println("Tekrardan karşınızda");
        
    }
    
}
