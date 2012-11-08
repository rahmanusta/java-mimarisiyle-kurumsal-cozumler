package com.usta.evredinleyici;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.validation.ValidationException;

/**
 *
 * @author usta
 */
@ManagedBean(name="nesne")
@SessionScoped
public class YonetimliNesne {
    
    FacesContext context=FacesContext.getCurrentInstance();
    HttpSession oturum=(HttpSession) context.getExternalContext().getSession(true);
    
    KayitliUyeler uyeler=KayitliUyeler.nesneOlustur();

    /**
     * Creates a new instance of YonetimliNesne
     */
    public YonetimliNesne() {
        
    }
    
    public String uyeKontrolEt(Uye uye){
       
        System.out.println("Üyeler: "+uyeler);

    if(uyeler.uyeler.contains(uye)) 
    {
        oturum.setAttribute("kayitliMi", Boolean.TRUE);
        return "korunakliSayfa.xhtml";
    }
        
    else {
        FacesContext cntx=FacesContext.getCurrentInstance();
            cntx.addMessage(null, new FacesMessage("Giriş için kayıtlı değilsiniz..!!"));

            oturum.setAttribute("kayitliMi", Boolean.FALSE);
        return "index.xhtml";
        }
        
        
    }
    
    public void oturumSonlandir(){
        
        oturum.invalidate();
        
    }
    
    public String ekle(Uye uye){
        uyeler.getUyeler().add(uye);
        return "index.xhtml";
    }
}
