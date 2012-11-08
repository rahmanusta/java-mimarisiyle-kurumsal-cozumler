package com.usta.decoupled;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 25.05.2012
 * Time: 09:04
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Yazici yazici=new Yazici();
        // Tarayici tarayici=new Tarayici();
        KirtasiyeServisi servis=new KirtasiyeServisi(yazici);
        servis.servisYap();
    }

}
