/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author usta
 */
@Singleton
@Startup
public class YaziUret {

    @PersistenceContext(unitName = "kodcu-PU")
    private EntityManager em;

    @PostConstruct
    private void hemenSonra() {
        yaziUret();
    }

    private void yaziUret() {

        kaydet(new Yazi("A.Bilgin Altıntaş", "16.01.2012", "Pardus projesinde neler oluyor ?"));
        kaydet(new Yazi("Rahman Usta", "26.01.2012", "Bulut Bilişimde IaaS, PaaS ve SaaS üçgeni"));
        kaydet(new Yazi("Hüseyin Akdoğan", "26.01.2012", "CSS: Kalıtım/Inheritance"));
        kaydet(new Yazi("Ender Ahmet Yurt", "26.01.2012", "Ruby on Rails Yazı Dizisi v4"));
        kaydet(new Yazi("Mehmet Aykut Bulgu", "26.01.2012", "Vaadin Web Framework’e Giriş"));
        kaydet(new Yazi("Nuri Sezgin", "26.01.2012", "Android Image Processing"));
    }

    private void kaydet(Yazi yazilar) {
        em.persist(yazilar);
    }


}
