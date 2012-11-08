package com.usta.cascade;

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
public class Test5 {
    
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
            trx.commit(); // Kaydettikten sonra
            
            trx.begin();
 
            System.out.println("?"+em.contains(saglayici));
            em.detach(saglayici);
            System.out.println("?"+em.contains(saglayici));
            saglayici.setSirketAdi("Ege Bilişim"); // Güncellemeden önce - sonra
            System.out.println("?"+em.contains(saglayici));
            em.merge(saglayici); // Ege Bilişim uygulanır mı?
           // em.merge(saglayici);
           // em.remove(saglayici);
           // saglayici.setSirketAdi("Kafkas Bilişim");
           // em.merge(saglayici);
            trx.commit();
            
      
        
        
        
    }
}
