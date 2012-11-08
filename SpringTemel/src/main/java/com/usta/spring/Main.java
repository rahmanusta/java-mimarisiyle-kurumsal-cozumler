package com.usta.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 25.05.2012
 * Time: 09:04 
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        
        ApplicationContext konteyner= new ClassPathXmlApplicationContext("spring-config.xml");
        
        KirtasiyeServisi servis= konteyner.getBean("servis",KirtasiyeServisi.class);
        servis.servisYap();
    }

}
