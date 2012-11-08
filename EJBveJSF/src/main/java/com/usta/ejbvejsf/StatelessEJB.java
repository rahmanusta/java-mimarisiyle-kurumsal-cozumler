/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf;

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
public class StatelessEJB {
    
    @PersistenceContext(unitName="kalicilikBirimi")
    private EntityManager em;
     
    public List<Kitap> tumKitaplar(){    
        TypedQuery<Kitap> sorgu = em.createNamedQuery("tumKitaplar",Kitap.class);  
        return sorgu.getResultList();     
    }
   
    public Kitap birKitap(Long id){
        return em.find(Kitap.class, id);
        
    }
    public void kitapSil(Kitap kitap){
        em.remove(kitap);
    }

    public Kitap kitapGuncelle(Kitap kitap){
        return em.merge(kitap);
    }
    public void kitapEkle(Kitap kitap){
        em.persist(kitap);
    }

    
}
