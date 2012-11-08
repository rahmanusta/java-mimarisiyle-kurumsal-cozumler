package com.usta;

import java.io.Serializable;
import javax.persistence.*;

/**
*
* @author usta
*/
@Entity 
@NamedQuery(name = "adaGoreKitaplar",  query = "SELECT b FROM Kitap b WHERE b.ADI ='Katre-i Matem'")
public class Kitap implements Serializable {

@Id 
@GeneratedValue(strategy= GenerationType.AUTO) 
private Long ID;

@Column(length=50,nullable=false) 
private String ADI;

private String YAZARI;

@Column(length=1500)
private String ACIKLAMA;
private String ISBN;
private double FIYAT;
private int SAYFA;

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

public Kitap() {
}

public Kitap(Long ID, String ADI, String YAZARI, String ACIKLAMA, String ISBN, float FIYAT, int SAYFA) {
this.ID = ID;
this.ADI = ADI;
this.YAZARI = YAZARI;
this.ACIKLAMA = ACIKLAMA;
this.ISBN = ISBN;
this.FIYAT = FIYAT;
this.SAYFA = SAYFA;
}


}