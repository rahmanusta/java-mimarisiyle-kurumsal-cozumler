package com.usta.cascade;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Enterprise Application Client main class.
 *
 */
public class Test3 {
    
    public static void main( String[] args ) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Cascading_PU");
        EntityManager em=emf.createEntityManager();     
        EntityTransaction trx=em.getTransaction();
        
        Kategori kategori=new Kategori();
        kategori.setKategori("Notebook");
        
        Urun urun=new Urun();
        urun.setUrunAdi("Lenovo abc");
        urun.setKategori(kategori);
        
        Urun urun2=new Urun();
        urun2.setUrunAdi("Toshiba def");
        urun2.setKategori(kategori);
          
        
        Saglayici saglayici=new Saglayici();
        saglayici.setSirketAdi("Marmara Bilişim");
        
        Set<Urun> torba=new HashSet<Urun>();
        torba.add(urun);
        torba.add(urun2);
        saglayici.setUrunler(torba);
        
        
      
            trx.begin();
            em.persist(saglayici); // Kaydetmeden önce
            saglayici.setSirketAdi("Ege Bilişim");
           // em.remove(saglayici); // Tek Transaction olursa, Sonra lar çalışmaz
            trx.commit(); // Kaydettikten sonra
            
            // em.detach(saglayici);
             em.remove(saglayici);
          trx.begin();
          
          // Exception in thread "main" java.lang.IllegalArgumentException:
          //  Entity must be managed to call remove: com.usta.mavenproject1.Saglayici@15422a8  
            
          
       trx.commit();
      
        
    }
}
