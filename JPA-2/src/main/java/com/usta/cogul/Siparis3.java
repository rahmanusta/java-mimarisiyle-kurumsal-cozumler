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
@Table(name="Siparis3_Tablo")
public class Siparis3 implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date olusturmaZamani;
    
    @OneToMany(fetch= FetchType.EAGER) //unidirectional
    @JoinColumn(name="Siparis3_FK")
    private List<SiparisIcerigi3> siparisler;

    public Siparis3() {
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

    public List<SiparisIcerigi3> getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(List<SiparisIcerigi3> siparisler) {
        this.siparisler = siparisler;
    }
    
    
    
    
}
