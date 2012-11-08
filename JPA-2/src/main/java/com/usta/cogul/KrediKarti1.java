package com.usta.cogul;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "KrediKarti1_Tablo")
public class KrediKarti1 implements Serializable {

    @Id
    private String numara;
    private String sokKT;
    private Integer CCV;
    @Enumerated(EnumType.STRING)
    private KrediKartiTip1 kartTipi;

    public KrediKarti1() {
    }

    public KrediKarti1(String numara, String sokKT, Integer CCV, KrediKartiTip1 kartTipi) {
        this.numara = numara;
        this.sokKT = sokKT;
        this.CCV = CCV;
        this.kartTipi = kartTipi;
    }

    
    public Integer getCCV() {
        return CCV;
    }

    public void setCCV(Integer CCV) {
        this.CCV = CCV;
    }

    public KrediKartiTip1 getKartTipi() {
        return kartTipi;
    }

    public void setKartTipi(KrediKartiTip1 kartTipi) {
        this.kartTipi = kartTipi;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSokKT() {
        return sokKT;
    }

    public void setSokKT(String sokKT) {
        this.sokKT = sokKT;
    }

}
