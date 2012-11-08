/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.tekilOrnekler;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.*;

/**
 *
 * @author usta
 */
@Entity
public class CD7 {
@Id
@GeneratedValue
private Long id;
private String parcaAdi;
private Float fiyat;
private String aciklama;
@Lob
private byte[] kapakResmi;
@ElementCollection
@CollectionTable(name="Parca_Listesi")
@MapKeyColumn (name = "pozisyon")
private Map<Integer, String> parca = new HashMap<Integer, String>();

    public CD7() {
    }

    public CD7(String parcaAdi, Float fiyat, String aciklama, byte[] kapakResmi) {
        this.parcaAdi = parcaAdi;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
        this.kapakResmi = kapakResmi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Float getFiyat() {
        return fiyat;
    }

    public void setFiyat(Float fiyat) {
        this.fiyat = fiyat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getKapakResmi() {
        return kapakResmi;
    }

    public void setKapakResmi(byte[] kapakResmi) {
        this.kapakResmi = kapakResmi;
    }

    public Map<Integer, String> getParca() {
        return parca;
    }

    public void setParca(Map<Integer, String> parca) {
        this.parca = parca;
    }

    public String getParcaAdi() {
        return parcaAdi;
    }

    public void setParcaAdi(String parcaAdi) {
        this.parcaAdi = parcaAdi;
    }

}