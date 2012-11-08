/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author usta
 */
@Entity(name = "YAZILAR")
@XmlRootElement

@NamedQueries({
        @NamedQuery(name = "tumYazilar", query = "SELECT b FROM YAZILAR b ORDER BY b.id DESC"),
        @NamedQuery(name = "suYazar", query = "SELECT b FROM YAZILAR b WHERE b.yazar LIKE :yazar ")
})
public class Yazi implements Serializable {
    private static final long serialVersionUID = 1L;

    //marshalling
//unmarshalling
    @Column(name = "yaziNo")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "yazar")
    private String yazar;
    @Column(name = "tarih")
    private String tarih;
    @Column(name = "yazi")
    private String yazi;

    public Yazi() {
    }

    public Yazi(String yazar, String tarih, String yazi) {

        this.yazar = yazar;
        this.tarih = tarih;
        this.yazi = yazi;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYazi() {
        return yazi;
    }

    public void setYazi(String yazi) {
        this.yazi = yazi;
    }


}
