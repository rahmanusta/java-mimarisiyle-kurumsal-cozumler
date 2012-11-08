/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.evredinleyici;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

/**
 *
 * @author usta
 */
public class EvreDinleyici implements PhaseListener {

    
    @Override
    public void afterPhase(PhaseEvent event) {
        System.out.println("AfterPhase");     
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        Boolean kayitliMi=Boolean.FALSE;
        System.out.println("BeforePhase");
        FacesContext context=FacesContext.getCurrentInstance();
        HttpSession oturum=(HttpSession) context.getExternalContext().getSession(true);
        Object obj=oturum.getAttribute("kayitliMi");
      
        if(obj!=null)
            kayitliMi=(Boolean)obj;
        
        if(!kayitliMi && context.getViewRoot().getViewId().equalsIgnoreCase("/korunakliSayfa.xhtml"))
        {
            NavigationHandler navigasyonYonetici =context.getApplication().getNavigationHandler();
            navigasyonYonetici.handleNavigation(context, null, "index.xhtml");
            
        }
    
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }

    
}
