/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.jsfuygulamasi;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author usta
 */
@Stateless
public class KitapEJB {
    
    @PersistenceContext(name="JsfUygulamasi_PU")
    private EntityManager em;
    
    
    public List<Kitap> tumKitaplariBul(){
     TypedQuery<Kitap> sorgu= em.createNamedQuery("tumKitaplar",Kitap.class); 
     return sorgu.getResultList();
    }
    
    public Kitap kitapEkle(Kitap kitap){
      em.persist(kitap);  
      return kitap;
    }
}