import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Televizyon tv;

    public static void main(String[] args) {

        menuGoster();
        boolean cikis = false;
        while (cikis == false) {
            System.out.println("Menuyu görmek istiyorsanız 9 u tuşlayınız");
            System.out.print("lütfen seçiminizi giriniz: ");
            int secim = scanner.nextInt();
            switch (secim) {
                case 0:
                    cikis = true;
                    System.out.println("Telizyondan cıkıs yapıldı");
                    break;

                case 1:
                    televizyonuKur();

                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    tvKapat();
                    break;
                case 4:
                    aktifKanal();
                    break;
                case 5:
                    kanalGoster();
                    break;
                case 6:
                    kanalDegistir();

                    break;
                case 7:
                    sesArtir();
                    break;
                case 8:
                    sesAzalt();
                    break;
                case 9:
                    menuGoster();
                    break;

            }
        }
    }

    private static void sesAzalt() {
        if (tv!=null)
        {
            tv.sesKis();
        }
        else
        {
            System.out.println("Lütfen ilk önce televizyonunuzu kurunuz");
        }
    }

    private static void sesArtir() {
        if (tv!=null)
        {
            tv.sesArtir();
        }
        else
        {
            System.out.println("Lütfen ilk önce televizyonunuzu kurunuz");
        }
    }

    private static void aktifKanal() {
        if (tv!=null)
        {
            tv.kanalCagir();
        }
        else
        {
            System.out.println("Lütfen ilk önce televizyonunuzu kurunuz");
        }

    }

    private static void kanalGoster() {
        if(tv != null)
        {
            tv.kanalGoster();
        }
        else{
            System.out.println("Televizyon kurulu değil");
        }

    }

    private static void kanalDegistir() {
        if(tv != null)
        {
            if (tv.isAcikMi()==true){
            System.out.print("Lütfen gitmek istediğiniz kanal numarasını girin: ");
            int sayi=scanner.nextInt();
            tv.kanalDegistir(sayi);}
            else{
                System.out.println("Lütfen ilk önce televizyonu açınız");            }
        }
        else{
            System.out.println("Televizyon kurulu değil");
        }

    }

    private static void tvKapat() {
        if (tv != null) {
            tv.tvKapat();
        } else {
            System.out.println("Lütfen ilk önce Televizyonu kurunuz ");
        }
    }

    private static void tvAc() {
        if (tv != null) {
            tv.tvAcik();
        } else {
            System.out.println("Lütfen ilk önce Televizyonu kurunuz ");
        }

    }

    private static void televizyonuKur() {
        if (tv == null) {
            scanner.nextLine();
            System.out.print("Lutfen televizyon markasını giriniz: ");
            String tvIsim = scanner.nextLine();
            System.out.print("Lutfen ekran boyutunu giriniz: ");
            String boyut = scanner.nextLine();
            tv = new Televizyon(tvIsim, boyut);
            System.out.println("Televizyon kuruldu");
        } else System.out.println("Televizyon zaten kurulu");
    }

    private static void menuGoster() {
        System.out.println("**********Menu**********");
        System.out.println("0 Çıkış:");
        System.out.println("1-Televizyonu kurmak");
        System.out.println("2-Televizyonu açmak");
        System.out.println("3-Televiyonu kapatmak");
        System.out.println("4-Akttif kanal");
        System.out.println("5-Kanallar");
        System.out.println("6-Kanal değiştirmek");
        System.out.println("7-Ses yükseltmek");
        System.out.println("8-Ses kısmak");
        System.out.println("9-Menu");

    }
}
