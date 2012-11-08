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
@Table(name="Album1_Tablo")
public class Album1 implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String albumAdi;
    private Double fiyat;
    private String aciklama;
    @ManyToMany(mappedBy = "albumler")
    // Bidirectional (çift yönlü )sahiplik bulunduğundan mappedBy özelliği ile diğer hakim taraf tanımlanmaktadır.
    private List<Sanatci1> sanatcilar;

    public Album1() {
    }

    public Album1(Long id, String albumAdi, Double fiyat, String aciklama, List<Sanatci1> sanatcilar) {
        this.id = id;
        this.albumAdi = albumAdi;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
        this.sanatcilar = sanatcilar;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getAlbumAdi() {
        return albumAdi;
    }

    public void setAlbumAdi(String albumAdi) {
        this.albumAdi = albumAdi;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Sanatci1> getSanatcilar() {
        return sanatcilar;
    }

    public void setSanatcilar(List<Sanatci1> sanatcilar) {
        this.sanatcilar = sanatcilar;
    }
    
}
