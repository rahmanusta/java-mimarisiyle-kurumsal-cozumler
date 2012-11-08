package com.usta.tekilOrnekler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
*
* @author usta
*/
@Entity // Kitap sınıfını Entity olarak tanımlar.
@Table(name="Kitap3_Tablo")
public class Kitap3 implements Serializable {
/* Değişken tanımlamaları başlangıç */
@Id // ID değişkenini birincil anahtar olarak tanımlar.
@GeneratedValue(strategy= GenerationType.AUTO) // Birincil anahtarın otomatik ve eşsiz olarak tanımlanmasını sağlar.
private Long ID;
private String ADI;
private String YAZARI;
private String ACIKLAMA;
private String ISBN;
private double FIYAT;
private int SAYFA;
@ElementCollection(fetch = FetchType.LAZY)
@CollectionTable(name = "etiketler")
private List<String> ETIKET = new ArrayList<String>();
/* Değişken tanımlamaları SON */



/* Yapılandırıcılar */
public Kitap3() {
}

public Kitap3(Long ID, String ADI, String YAZARI, String ACIKLAMA, String ISBN, float FIYAT, int SAYFA, List<String> ETIKET) {
this.ID = ID;
this.ADI = ADI;
this.YAZARI = YAZARI;
this.ACIKLAMA = ACIKLAMA;
this.ISBN = ISBN;
this.FIYAT = FIYAT;
this.SAYFA = SAYFA;
this.ETIKET=ETIKET;
}
/* Yapılandırıcılar SON */

/* Değişkenlere ait getter-setter metodları */
public String getADI() {
return ADI;
}

public void setADI(String ADI) {
this.ADI = ADI;
}

public double getFIYAT() {
return FIYAT;
}

public void setFIYAT(double FIYAT) {
this.FIYAT = FIYAT;
}

public Long getID() {
return ID;
}

public void setID(Long ID) {
this.ID = ID;
}

public String getISBN() {
return ISBN;
}

public void setISBN(String ISBN) {
this.ISBN = ISBN;
}

public int getSAYFA() {
return SAYFA;
}

public void setSAYFA(int SAYFA) {
this.SAYFA = SAYFA;
}

public String getYAZARI() {
return YAZARI;
}

public void setYAZARI(String YAZARI) {
this.YAZARI = YAZARI;
}
public String getACIKLAMA() {
return ACIKLAMA;
}

public void setACIKLAMA(String ACIKLAMA) {
this.ACIKLAMA = ACIKLAMA;
}

public List<String> getETIKET() {
return ETIKET;
}

public void setETIKET(List<String> ETIKET) {
this.ETIKET = ETIKET;
}
/* Değişkenlere ait getter-setter metodları SON */


}