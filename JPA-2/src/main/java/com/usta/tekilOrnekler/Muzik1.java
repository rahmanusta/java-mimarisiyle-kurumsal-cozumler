package com.usta.tekilOrnekler;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Muzik1_Tablo")
public class Muzik1 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String parcaAdi;
    private Float sure;
    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] sarki;
    private String aciklama;

    public Muzik1() {
    }

    public Muzik1(Long id, String parcaAdi, Float sure, byte[] sarki, String aciklama) {
        this.id = id;
        this.parcaAdi = parcaAdi;
        this.sure = sure;
        this.sarki = sarki;
        this.aciklama = aciklama;
    }

    
    
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParcaAdi() {
        return parcaAdi;
    }

    public void setParcaAdi(String parcaAdi) {
        this.parcaAdi = parcaAdi;
    }

    public byte[] getSarki() {
        return sarki;
    }

    public void setSarki(byte[] sarki) {
        this.sarki = sarki;
    }

    public Float getSure() {
        return sure;
    }

    public void setSure(Float sure) {
        this.sure = sure;
    }
    
    
}
