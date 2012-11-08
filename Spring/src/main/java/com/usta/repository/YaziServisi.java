/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package com.usta.repository;

import com.usta.domain.Yazi;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;

/**
 * @author usta
 */
@Repository
@Transactional(readOnly =false,propagation= Propagation.REQUIRES_NEW)
public class YaziServisi implements IYaziServisi {

    @PersistenceContext
    EntityManager em;

    @Override
    public void kaydet(Yazi yazi) {
        em.persist(yazi);
        em.flush();
    }

    @Override
  //  @Transactional(readOnly=true)
    public List<Yazi> tumYazilar() {
        Query sorgu = em.createNamedQuery("tumYazilar");

        return sorgu.getResultList();
    }

    @Override
    public Yazi suYazar(String yazar) {
        return em.find(Yazi.class, yazar);
    }

    @Override
    public void sil(Long id) {

        em.remove(em.find(Yazi.class,id));
        em.flush();
    }

    @Override
    public void guncelle(Yazi yazi,Yazi eski) {

      Yazi Eski=  em.merge(eski);
      Eski.setTarih(yazi.getTarih());
      Eski.setYazar(yazi.getYazar());
      Eski.setYazi(yazi.getYazi());
      em.flush();
    }

}
