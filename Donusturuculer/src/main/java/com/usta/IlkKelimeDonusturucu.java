    /*
    * To change this template, choose Tools | Templates
    * and open the template in the editor.
    */
    package com.usta;

    import javax.faces.application.FacesMessage;
    import javax.faces.component.UIComponent;
    import javax.faces.context.FacesContext;
    import javax.faces.convert.Converter;
    import javax.faces.convert.ConverterException;
    import javax.faces.convert.FacesConverter;

    /**
    *
    * @author usta
    */
    @FacesConverter("ilkKelimeDonusturucusu")
    public class IlkKelimeDonusturucu  implements Converter{

    // Dönen değer yönetimli nesneye    
    @Override 
    public Object getAsObject(FacesContext context, UIComponent component, String value) {

    if(value==null || value.equals("")) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_WARN,null, "Bir cümle girilmeli."));
        }
    if(!value.contains(" ")) {
            return value;
        }
    return value.split(" ")[0]; 
    }

    // Dönen değer önyüze
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

    if(value==null || value.toString().equals("")) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_WARN,null, "Bir cümle girilmeli."));
        }
    String cumle=value.toString();
    if(!cumle.contains(" ")) {
            return cumle;
        }
    String[] kelimeler=cumle.split(" ");

    return kelimeler[0];
    }

    }
