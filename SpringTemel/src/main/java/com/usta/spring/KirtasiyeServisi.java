package com.usta.spring;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 25.05.2012
 * Time: 09:08
 * To change this template use File | Settings | File Templates.
 */

public class KirtasiyeServisi {

    Cihaz cihaz;
    public KirtasiyeServisi(Cihaz cihaz) {
        this.cihaz=cihaz;
    }
    
    public void servisYap(){
        cihaz.calis();
    }
}



