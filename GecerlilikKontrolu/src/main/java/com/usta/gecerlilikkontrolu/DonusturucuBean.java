/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.gecerlilikkontrolu;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author usta
 */
@ManagedBean(name="donusturucuBean")
@RequestScoped
public class DonusturucuBean {
    
    Date tarih;

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
    
    public void ekranaBas(){
        System.out.println("Tarih: "+this.tarih);
    }

    /**
     * Creates a new instance of DonusturucuBean
     */
    public DonusturucuBean() {
    }
}
