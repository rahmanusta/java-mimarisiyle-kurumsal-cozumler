/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cascade;

import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author usta
 */
@Entity
@EntityListeners({SurecIzleyici.class})
public class Saglayici {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long saglayiciId;
    private String sirketAdi;
    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Urun> urunler;

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public Set<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(Set<Urun> urunler) {
        this.urunler = urunler;
    }

    public Long getSaglayiciId() {
        return saglayiciId;
    }

//    @PrePersist
//    public void KaydetmedenOnce() throws IllegalAccessException{
//        System.out.println("Kaydetmeden önce");
//        if (sirketAdi.length()<4)
//            throw new IllegalAccessException(sirketAdi);
//
//    }
//
//    @PreUpdate
//    public void GuncellemedenOnce() {
//        System.out.println("GuncellemedenOnce");
//
//    }
//
//    @PreRemove
//    public void SilmedenOnce() {
//        System.out.println("SilmedenOnce");
//    }
//
//    @PostLoad
//    public void YuklendiktenSonra() {
//        System.out.println("YuklendiktenSonra");
//
//    }
//
//    @PostPersist
//    public void KaydetmedenSonra() {
//
//        System.out.println("Kaydettikten sonra");
//    }
//
//    @PostUpdate
//    public void GuncellemedenSonra() {
//        System.out.println("GuncellemedenSonra");
//
//    }
//
//    @PostRemove
//    public void SilmedenSonra() {
//        System.out.println("SilmedenSonra");
//    }
}