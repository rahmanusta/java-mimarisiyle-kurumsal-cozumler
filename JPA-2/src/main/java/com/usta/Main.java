package com.usta;

import com.usta.tekilOrnekler.Kitap1;
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
Kitap1 kitap=new Kitap1();
kitap.setADI("Katre-i Matem");
kitap.setYAZARI("İskender Pala");
kitap.setACIKLAMA(
"Roman, müzayededen alınan elyazması bir kitabın"
+ "hikâyesi olarak başlıyor. Okurlar, bu elyazması"
+ "kitabın açtığı kapıdan içeri giriyor, bir devre adını"
+ "veren lalenin izinde İskender Pala’nın yarattığı"
+ "etkileyici ve büyüleyici bir atmosferin"
+ "içinde yol alıyor. "
);
kitap.setFIYAT(9.90);
kitap.setISBN("9786054322381");
kitap.setSAYFA(519);

// Entity Manager sağlayıcısından Entity Manager ve Transaction nesnesi alınır. 
EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-Ornek1_PU");
EntityManager em = emf.createEntityManager();
EntityTransaction tx= em.getTransaction();

tx.begin(); // Transaction başlatılır
em.persist(kitap);
tx.commit(); // Transaction onaylanır.

// Kitap entity' si içinde tanımlı NamedQuery ile sorgu oluşturulur.
Query sorgu=em.createNamedQuery("adaGoreKitaplar");
// Sorgu ile ilk eşleşen nesne döndürülür.
// Dönen ifade Object türünde olduğundan,
// (Kitap) ifadesi ile cast işlemi gereklidir.
Kitap1 sonuc=(Kitap1)sorgu.getSingleResult();
// Bulunan kayıt listelenir.
System.out.println("*******************************"+"\n"+
                   "Kitap id : "+sonuc.getID()+"\n"+
                   "Kitap adı :"+sonuc.getADI()+"\n"+
                   "Kitap yazarı :"+sonuc.getYAZARI()+"\n"+
                   "Kitap açıklaması :"+sonuc.getACIKLAMA()+"\n"+
                   "Kitap fiyatı :"+sonuc.getFIYAT()+"\n"+
                   "Kitap isbn : "+sonuc.getISBN()+"\n"+
                   "Kitap sayfa sayısı"+sonuc.getSAYFA()+"\n"+
                   "*******************************");

// Entity Manager ve sağlayıcı nesneler kapatılır.
em.close();
emf.close();

}
}
