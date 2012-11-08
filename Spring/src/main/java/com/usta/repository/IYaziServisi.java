/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usta.repository;

import com.usta.domain.Yazi;

import java.util.List;

/**
 * @author usta
 */

public interface IYaziServisi {

    public void kaydet(Yazi yazi);

    public List<Yazi> tumYazilar();

    public Yazi suYazar(String yazar);

    public void sil(Long id);

    public void guncelle(Yazi yazi,Yazi eski);


}
