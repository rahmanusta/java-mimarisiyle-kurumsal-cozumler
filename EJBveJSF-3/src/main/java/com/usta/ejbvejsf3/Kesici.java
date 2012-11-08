/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.ejbvejsf3;

import java.io.Serializable;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author usta
 */
public class Kesici implements Serializable{

    @AroundInvoke
    public Object kesici(InvocationContext context) {

         Object o=null;
        System.out.println("Hangi sınıfta kesim gerçekleşti? "+context.getTarget());
        System.out.println("Hangi metod kesime uğradı? "+context.getMethod().getName());
       
        try {
            
            if(context.getMethod().getName().equalsIgnoreCase("urunEkle"))
            {
            Object[] parametreler=context.getParameters(); // Kesilen metodun parametreleri alınıyor
            Urun urun=(Urun)parametreler[0]; // İlk parametre çekilerek Casting uygulanıyor
            urun.setFiyat(urun.getFiyat()*1.18); // Ürün fiyatlarına K.D.V. ekleniyor
              
            }

           o= context.proceed(); // Diğer metoda geçmeyi deneyecek
           
           
        } catch (Exception ex) {
         //
        }
        return o;
           
        
    }
    
}
