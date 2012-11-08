package com.usta;

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
Kitap kitap=new Kitap();
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
Kitap kitap2=(Kitap)sorgu.getSingleResult();
// Bulunan kayıt listelenir.
System.out.println("*******************************"+"\n"+
                   "Kitap id : "+kitap2.getID()+"\n"+
                   "Kitap adı :"+kitap2.getADI()+"\n"+
                   "Kitap yazarı :"+kitap2.getYAZARI()+"\n"+
                   "Kitap açıklaması :"+kitap2.getACIKLAMA()+"\n"+
                   "Kitap fiyatı :"+kitap2.getFIYAT()+"\n"+
                   "Kitap isbn : "+kitap2.getISBN()+"\n"+
                   "Kitap sayfa sayısı"+kitap2.getSAYFA()+"\n"+
                   "*******************************");

// Entity Manager ve sağlayıcı nesneler kapatılır.
em.close();
emf.close();

}
}
