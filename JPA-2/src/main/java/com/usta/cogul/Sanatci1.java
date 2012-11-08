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
@Table(name="Sanatci1_Tablo")
public class Sanatci1 implements Serializable {

@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Long id;
private String ad;
private String soyad;
@ManyToMany
@JoinTable(name="Sanatci1_Album1_Katilim_Tablosu",
joinColumns=@JoinColumn(name="Sanatci1_FK"),
inverseJoinColumns=@JoinColumn(name="Album1_FK"))
// @JoinTable notasyonu iki entity sınıf için oluşturulacak katılım tablosunu (Join Table) düzenlemektedir.
// joinColumn özelliği hakim tarafı biçimlendirirken,
// inverseJoinColumns özelliği diğer tarafı biçimlendirmektedir.
private List<Album1> albumler; // Album1 entity sınıfı türünde bir Java listesi


// Getter, Setter yordamları ve Yapılandırıcılar (Constructors)

    public Sanatci1() {
    }

    public Sanatci1(Long id, String ad, String soyad, List<Album1> albumler) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.albumler = albumler;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Album1> getAlbumler() {
        return albumler;
    }

    public void setAlbumler(List<Album1> albumler) {
        this.albumler = albumler;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
    
    
}
