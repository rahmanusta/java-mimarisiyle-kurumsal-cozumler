package com.usta.tekilOrnekler;

import com.usta.cogul.Adres5;
import com.usta.cogul.Musteri5;
import com.usta.miras.*;
import javax.persistence.*;

/**
* Hello world!
*
*/
public class Main 
{
public static void main( String[] args )
{
// Bir kitap nesnesi oluşturulur.


// Entity Manager sağlayıcısından Entity Manager ve Transaction nesnesi alınır. 
EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-Ornek1_PU");
EntityManager em = emf.createEntityManager();
EntityTransaction tx= em.getTransaction();
//Musteri5 musteri=new Musteri5("emin", "şahin","hothot.com", "0900");
//Adres5 adres=new Adres5("sokak1", "sokak2", "", "", "", "");
//musteri.setAdres(adres);
//adres.setMusteri(musteri);

//Urun4  urun4=new Urun4("Multimedya",25.0,"Multimedya ürünleri indirimli satış");
//CD4 cd4=new CD4("marmara prodüksüyon",10,56.5F,"sanat müziği","istanbul hatırası",10.0,"yeni albüm");
//Kitap4 kitap4=new Kitap4("32752ASDG343FGD","papatya","450","Java",10.0,"Java ve temelleri");

//Urun5  urun5=new Urun5("Multimedya",25.0,"Multimedya ürünleri indirimli satış");
//CD5 cd5=new CD5("marmara prodüksüyon",10,56.5F,"sanat müziği","istanbul hatırası",10.0,"yeni albüm");
//Kitap5 kitap5=new Kitap5("32752ASDG343FGD","papatya","450","Java",10.0,"Java ve temelleri");

Urun6  urun6=new Urun6 ("Multimedya",25.0,"Multimedya ürünleri indirimli satış");
CD6 cd6=new CD6 ("marmara prodüksüyon",10,56.5F,"sanat müziği","istanbul hatırası",10.0,"yeni albüm");
Kitap6 kitap6=new Kitap6 ("32752ASDG343FGD","papatya","450","Java",10.0,"Java ve temelleri");

tx.begin(); // Transaction başlatılır
//em.persist(musteri);
//em.persist(adres);
em.persist(urun6);
em.persist(kitap6);
em.persist(cd6);
tx.commit(); // Transaction onaylanır.

// Entity Manager ve sağlayıcı nesneler kapatılır.
em.close();
emf.close();

}
}
