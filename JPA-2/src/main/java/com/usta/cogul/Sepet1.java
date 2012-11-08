/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.cogul;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author usta
 */
@Entity
@Table(name="Sepet1_Tablo")
public class Sepet1 {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP) 
    private Date olusturmaZamani;
    // @OneToMany -opsiyonel-
    // List türünde bir referans varsayılan olarak @OneToOne ve unidirectional (tekyönlü) olarak yapılandırılır.
    private List<SiparisIcerigi1> siparisler; // Birden fazla sipariş içereceğinden referans Liste türündedir.

    public Sepet1() {
        // olusturmaZamani referansı ilk oluşturulduğu anda o anki zaman ile damgalanır.
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

    public List<SiparisIcerigi1> getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(List<SiparisIcerigi1> siparisler) {
        this.siparisler = siparisler;
    }
    
     
}
