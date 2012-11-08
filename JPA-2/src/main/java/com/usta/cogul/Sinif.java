/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cogul;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author usta
 */
@Entity
public class Sinif implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "sinif_id")
    private Integer sinifId;
    @Column(name = "adi")
    private String adi;   
    @OneToMany
    private List<Ogrenci> ogrenciler;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }
    public Sinif() {
    }
}