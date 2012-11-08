package com.usta.coupled;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 25.05.2012
 * Time: 09:13
 * To change this template use File | Settings | File Templates.
 */
public class KirtasiyeServisi {
    
    Yazici yazici;

    public KirtasiyeServisi() {
        yazici=new Yazici();
    }
    
    public void servisYap(){
        yazici.calis();
    }
}
