/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.kontrolor;

import com.usta.domain.Yazi;
import com.usta.repository.IYaziServisi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author usta
 */
@Component(value = "yazikontrolor")
@Scope(value = "request")
public class YaziKontolor {

    @Autowired
    IYaziServisi servis;
    
    Yazi yazi = new Yazi();
    List<Yazi> yaziListesi = new ArrayList<Yazi>();


    @PostConstruct
    private void yazilariYukle() {
        yaziListesi = servis.tumYazilar();
    }

    public String yaziEkle() {

        servis.kaydet(yazi);
        yaziListesi = servis.tumYazilar();
        return "/index.xhtml";
    }
    
    public String yaziSil(Long id){

        servis.sil(id);
        yaziListesi = servis.tumYazilar();
        return "/index.xhtml";
    }
    
    public String yaziGuncelle(Yazi yazi,Yazi eski){
        servis.guncelle(yazi,eski);
        yaziListesi = servis.tumYazilar();
        return "/index.xhtml";
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
