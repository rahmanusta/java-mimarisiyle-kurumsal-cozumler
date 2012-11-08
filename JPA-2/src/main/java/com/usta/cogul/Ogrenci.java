/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cogul;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author usta
 */
@Entity
public class Ogrenci implements Serializable {
    private static final long serialVersionUID = 1L;
   
@Id
    @Basic(optional = false)
    @Column(name = "ogrenci_id")
    private Integer ogrenciId;
   
@Column(name = "adi")
    private String adi;
   
@Column(name = "soyadi")
    private String soyadi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }


}
