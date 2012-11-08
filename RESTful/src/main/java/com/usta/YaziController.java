/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package com.usta;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author usta
 */
@ManagedBean
@RequestScoped
public class YaziController {

    //@EJB
    @Inject
    YazilarEJB yazilarEJB;
    
    Yazi yazi = new Yazi();
    List<Yazi> yaziListesi = new ArrayList<Yazi>();


    @PostConstruct
    private void yazilariYukle() {
        yaziListesi = yazilarEJB.tumYazilar();
    }

    public String yaziEkle() {
        yazi = yazilarEJB.yaziEkle(yazi);
        yaziListesi = yazilarEJB.tumYazilar();
        return "index.xhtml";
    }


    public Yazi getYazi() {
        return yazi;
    }

    public void setYazi(Yazi yazi) {
        this.yazi = yazi;
    }

    public List<Yazi> getYaziListesi() {
        return yaziListesi;
    }

    public void setYaziListesi(List<Yazi> yaziListesi) {
        this.yaziListesi = yaziListesi;
    }
}




