public class Kanallar {
    private String kanalIsmi;
    private int kanalNo;
    private String kanalTuru;

    public Kanallar(String kanalIsmi, int kanalNo, String kanalTuru) {
        this.kanalIsmi = kanalIsmi;
        this.kanalNo = kanalNo;
        this.kanalTuru = kanalTuru;
    }

    public String getKanalIsmi() {
        return kanalIsmi;
    }

    public void setKanalIsmi(String kanalIsmi) {
        this.kanalIsmi = kanalIsmi;
    }

    public int getKanalNo() {
        return kanalNo;
    }

    public void setKanalNo(int kanalNo) {
        this.kanalNo = kanalNo;
    }

    public String getKanalTuru() {
        return kanalTuru;
    }

    public void setKanalTuru(String kanalTuru) {
        this.kanalTuru = kanalTuru;
    }

    @Override
    public String toString() {
        return
                kanalNo+"- "+
                "kanal ismi: "+kanalIsmi+
                "kanal turu: "+kanalTuru;
    }
}
