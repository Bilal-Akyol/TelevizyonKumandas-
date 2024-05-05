import java.util.ArrayList;

public class Televizyon {
    private String model;
    private String ekranBoyutu;
    private boolean acikMi;
    ArrayList<Kanallar> kanal;
    private int varSayilanKanal = 0;
    private boolean kanaldegisti = false;
    private int ses=10;


    public Televizyon(String model, String ekranBoyutu) {
        this.model = model;
        this.ekranBoyutu = ekranBoyutu;
        kanal = new ArrayList<>();
        kanalOlsutur();
        this.acikMi = false;


    }

    public void kanalDegistir(int sayi) {


        if (sayi <= kanal.size() && 0 <= sayi) {
            System.out.println(kanal.get(sayi - 1));
            varSayilanKanal = sayi - 1;
            kanaldegisti = true;
        } else {
            System.out.print("Yanlış bir sayı girdiniz. Lütfen yeni bir sayı giriniz: ");
            sayi= Main.scanner.nextInt();
            kanalDegistir(sayi);
            varSayilanKanal = sayi - 1;
            kanaldegisti = true;
        }



    }

    public void kanalOlsutur() {

        Spor bjkTv = new Spor("Bjk tv", 1);
        kanal.add(bjkTv);
        Haber haberTurk = new Haber("HaberTürk", 2);
        kanal.add(haberTurk);
        Dizi fox = new Dizi("Fox tv", 3);
        kanal.add(fox);

    }

    public void kanalCagir() {
        if (acikMi == true) {
            System.out.println("Şuan Ki aktif kanal");
            System.out.println(kanal.get(varSayilanKanal));

        } else {
            System.out.println("Lütfen ilk önce televizyonunuzu açın");
        }

    }
    public void kanalGoster() {
        if (acikMi == true) {

            System.out.println("**********Kanallar************");

            for (int i = 0; i < kanal.size(); i++) {
                System.out.println(kanal.get(i));
            }
        } else {
            System.out.println("Lütfen ilk önce televizyonu açınız");
        }
    }

    public void tvAcik() {
        if (acikMi == false) {

            System.out.println("Televizyon açıldı");
            acikMi = true;

        } else {

            System.out.println("Televizyon zaten açık");
        }
    }

    public void tvKapat() {
        if (acikMi == true) {
            acikMi = false;
            System.out.println("Televizyon Kapatıldı");
            acikMi = false;
        } else {

            System.out.println("Televizyon zaten kapalı");
        }
    }
    public void sesArtir()
    {
        if (acikMi==true){
            if (ses<20)
            {
                ses++;
                System.out.println("Ses seviyesi 1 artırıldı   mevcut ses seviyesi: "+ses);
            }else {
                System.out.println("Ses seviyeniz maksimum seviyede");
            }
        }
        else
        {
            System.out.println("Lütfen ilk önce Televizyonunuzu açın");
        }

    }
    public void sesKis()
    {
        if (acikMi==true){
            if (ses>0)
            {
                ses--;
                System.out.println("Ses seviyesi 1 azaltıldı   mevcut ses seviyesi: "+ses);
            }else {
                System.out.println("Ses seviyeniz minimum seviyede");
            }
        }
        else
        {
            System.out.println("Lütfen ilk önce Televizyonunuzu açın");
        }

    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEkranBoyutu() {
        return ekranBoyutu;
    }

    public int getVarSayilanKanal() {
        return varSayilanKanal;
    }


    public void setEkranBoyutu(String ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }


    public boolean isAcikMi() {
        return acikMi;
    }
}
