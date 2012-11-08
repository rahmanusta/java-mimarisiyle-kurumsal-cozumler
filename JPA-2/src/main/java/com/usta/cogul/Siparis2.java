/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cogul;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author usta
 */
@Entity
@Table(name="Siparis2_Tablo")
public class Siparis2 implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date olusturmaZamani;
    
    @OneToMany //unidirectional
    @JoinTable(name="Siparis2_SiparisIcerigi2_KatilimTablosu",
            joinColumns=@JoinColumn(name="Siparis2_FK"),
            inverseJoinColumns=@JoinColumn(name="SiparisIcerigi2_FK"))
    private List<SiparisIcerigi2> siparisler;

    public Siparis2() {
        this.olusturmaZamani=new Date();
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOlusturmaZamani() {
        return olusturmaZamani;
    }

    public void setOlusturmaZamani(Date olusturmaZamani) {
        this.olusturmaZamani = olusturmaZamani;
    }

    public List<SiparisIcerigi2> getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(List<SiparisIcerigi2> siparisler) {
        this.siparisler = siparisler;
    }
    
    
    
    
}
