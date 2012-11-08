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
public class Test1 {
    
    public static void main( String[] args ) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Cascading");
        EntityManager em=emf.createEntityManager();     
        EntityTransaction trx=em.getTransaction();
        
        Kategori kategori=new Kategori();
        kategori.setKategori("Notebook");
        
        Urun urun=new Urun();
        urun.setUrunAdi("Samsunğ");
        urun.setKategori(kategori);
        
        Urun urun2=new Urun();
        urun2.setUrunAdi("Toşhiba");
        urun2.setKategori(kategori);
          
        
        Saglayici saglayici=new Saglayici();
        saglayici.setSirketAdi("Marmara Bilişim");
        
        Set<Urun> torba=new HashSet<Urun>();
        torba.add(urun);
        torba.add(urun2);
        saglayici.setUrunler(torba);

        
        try {
            trx.begin(); // Transaction başlatılır
                em.persist(saglayici);
            //em.persist(urun);
           // em.persist(kategori);
          //  em.persist(urun2);
        
           // trx.setRollbackOnly(); // Rollback için işaret koyar..
            trx.commit(); // Transaction onaylanır
        } catch (Exception e) {
            trx.rollback(); // Transaction başarısız ise, işlem geri çekilir.
        }

    }
}
