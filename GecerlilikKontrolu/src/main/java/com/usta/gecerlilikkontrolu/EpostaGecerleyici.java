/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.gecerlilikkontrolu;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author usta
 */
@FacesValidator("epostaGecerleyici")
public class EpostaGecerleyici implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

        System.out.println("Girdi:" + value);
        String girdi = value.toString();
        if (!girdi.contains("@") || girdi.equalsIgnoreCase("")) {
            
            FacesMessage mesaj = new FacesMessage();
            mesaj.setSummary("Geçersiz eposta adresi..!");
            mesaj.setSeverity(FacesMessage.SEVERITY_WARN);

            throw new ValidatorException(mesaj);

        }
    }
}