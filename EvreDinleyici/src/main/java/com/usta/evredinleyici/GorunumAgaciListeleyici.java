/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.evredinleyici;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlHead;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutcomeTargetLink;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.visit.VisitCallback;
import javax.faces.component.visit.VisitContext;
import javax.faces.component.visit.VisitResult;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author usta
 */
public class GorunumAgaciListeleyici implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent event) {

// Aktif iş parçacığı ve geçerli yaşam döngüsü için FacesContext nesnesi elde edilir.
        FacesContext context = FacesContext.getCurrentInstance();

// Geçerli FacesContext üzerinden üretilen görünüm ağacı elde edilir.
        UIViewRoot gorunumAgaci = context.getViewRoot();

// Görünüm ağacının visitTreevisitTree yordamı ile, ağaç altındaki tüm bileşenler ziyaret edilir.
        gorunumAgaci.visitTree(VisitContext.createVisitContext(context), new VisitCallback() {
            @Override
            public VisitResult visit(VisitContext context, UIComponent target) {

                System.out.println("Bileşen ID: " + target.getId());
                System.out.println("Bileşen Ailesi: " + target.getFamily());
                System.out.println("Bileşen Çözümleme Tipi: " + target.getRendererType());
                System.out.println("Bileşen Alt çocukları: " + target.getChildCount());

                if (target instanceof HtmlInputText) {
                    System.out.println("Bileşen değeri: " + ((HtmlInputText) target).getValue());
                    
                }
                if (target instanceof HtmlOutputText) {
                    System.out.println("Bileşen değeri: " + ((HtmlOutputText) target).getValue());
                }
                if (target instanceof HtmlHead) {
                    System.out.println("Bileşen değeri: " + ((HtmlHead) target).getValue());
                }
                if (target instanceof HtmlInputSecret) {
                    System.out.println("Bileşen değeri: " + ((HtmlInputSecret) target).getValue());
                }
                if (target instanceof HtmlOutcomeTargetLink) {
                    System.out.println("Bileşen değeri: " + ((HtmlOutcomeTargetLink) target).getValue());
                }
                if (target instanceof HtmlOutputLabel) {
                    System.out.println("Bileşen değeri: " + ((HtmlOutputLabel) target).getValue());
                } else {
                    System.out.println("Bileşen değeri :" + target.toString());
                }

                System.out.println("**********");

                return VisitResult.ACCEPT;
            }
        });
    }

    @Override
    public void beforePhase(PhaseEvent event) {
// Boş
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.APPLY_REQUEST_VALUES;
    }
}