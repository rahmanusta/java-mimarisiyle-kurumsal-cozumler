/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author usta
 */
@Entity(name = "YAZILAR")
@NamedQueries({
        @NamedQuery(name = "tumYazilar", query = "SELECT b FROM YAZILAR b ORDER BY b.yaziNo DESC"),
        @NamedQuery(name = "suYazar", query = "SELECT b FROM YAZILAR b WHERE b.yazar LIKE :yazar ")
})
public class Yazi implements Serializable{

    @Column(name = "yaziNo")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long yaziNo;
    @Column(name = "yazar", nullable = false)
    private String yazar;
    @Column(name = "tarih", nullable = true)
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

    public Long getYaziNo() {
        return yaziNo;
    }

    public void setYaziNo(Long yaziNo) {
        this.yaziNo = yaziNo;
    }

}
