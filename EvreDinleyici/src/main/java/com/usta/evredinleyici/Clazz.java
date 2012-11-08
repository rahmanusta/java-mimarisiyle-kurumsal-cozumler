/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.evredinleyici;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author usta
 */
public class Clazz implements PhaseListener{

    @Override
    public void afterPhase(PhaseEvent event) {
        System.out.println(event.getPhaseId()+ "evresi tamamlandıktan hemen sonra..");
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println(event.getPhaseId()+ "evresi başlamadan hemen önce..");
    }

    @Override
    public PhaseId getPhaseId() {
        
      //  PhaseId.RESTORE_VIEW;         // Görünümü Oluşturma / Tazeleme
      //  PhaseId.APPLY_REQUEST_VALUES; // Talep Değerlerini Uygulama
      //  PhaseId.PROCESS_VALIDATIONS;  // Dönüştürme ve Geçerlilik Kontrolü
      //  PhaseId.UPDATE_MODEL_VALUES;  // Model Değerlerini Güncelleme
      //  PhaseId.INVOKE_APPLICATION;   // İş Mantığını İşletme
      // PhaseId.RENDER_RESPONSE;       // Yanıt Çözümleme
        
        return PhaseId.ANY_PHASE;
                
    }
    
}
