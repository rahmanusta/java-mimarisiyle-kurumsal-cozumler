package com.usta.tekilOrnekler;

import java.io.Serializable;
import javax.persistence.*;

/**
*
* @author usta
*/
@Entity // Kitap sınıfını Entity olarak tanımlar.
@Table(name="Kitap2_Tablo")
public class Kitap2 implements Serializable {
/* Değişken tanımlamaları başlangıç */
@Id // ID değişkenini birincil anahtar olarak tanımlar.
@GeneratedValue(strategy= GenerationType.AUTO) // Birincil anahtarın otomatik ve eşsiz olarak tanımlanmasını sağlar.
private Long ID;
@Column(name = "Kitap2_ADI", nullable = false, updatable = false)
private String ADI;
private String YAZARI;
@Column(length = 1500)
private String ACIKLAMA;
private String ISBN;
private double FIYAT;
@Column(name = "Sayfa_Sayisi", nullable = false)
private int SAYFA;
/* Değişken tanımlamaları SON */

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
/* Değişkenlere ait getter-setter metodları SON */

/* Yapılandırıcılar */
public Kitap2() {
}

public Kitap2(Long ID, String ADI, String YAZARI, String ACIKLAMA, String ISBN, float FIYAT, int SAYFA) {
this.ID = ID;
this.ADI = ADI;
this.YAZARI = YAZARI;
this.ACIKLAMA = ACIKLAMA;
this.ISBN = ISBN;
this.FIYAT = FIYAT;
this.SAYFA = SAYFA;
}
/* Yapılandırıcılar SON */

}