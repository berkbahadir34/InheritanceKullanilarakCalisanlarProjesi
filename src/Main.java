import java.util.Scanner;

public class Main {
    public static void main(String[] argc)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Çalışanalr Programına Hoşgeldiniz.");
        String islemler = "İşlemler..\n"+
                "1. Yazılımcı İşlemleri \n"+
                "2. Yönetici İşlemleri \n"+
                "Çıkış için q'a basın..";
        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("********************");

        while (true){
            System.out.print("İşlemi Seçiniz : ");
            String islem =scanner.nextLine();

            if (islem.equals("q"))
            {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                Yazlimci yazilimci = new Yazlimci("Ahmet Berk","Bahadır",567,"Java");
                String yazilimci_islem="1. Format At\n"+
                                       "2. Bilgileri Göster\n"+
                                       "Çıkış için q'a basın.. ";
                System.out.println(yazilimci_islem);
                while(true)
                {
                    System.out.print("İşlemi Seçiniz");
                    String y_islem= scanner.nextLine();
                    if(y_islem.equals("q"))
                    {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor");
                        break;
                    }
                    else if(y_islem.equals("1"))
                    {
                        System.out.println("İşletim Sistemi: ");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatat(isletim_sistemi);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yazilimci.bilgilerigoster();
                    }
                    else
                    {
                        System.out.println("Geçersiz Yazılımcı İşlemi");
                    }
                }
            }
            else if (islem.equals("2"))
            {
                Yonetici yonetici=new Yonetici("Aybike","Can",132,45);
                String yonetici_islem="1. Zam Yap "+
                                      "2. Bilgileri Göster "+
                                      "3. Çıkış için q'a basın..";
                System.out.println(yonetici_islem);

                while(true)
                {
                    System.out.print("İşlemi Seçiniz: ");
                    String yon_islem=scanner.nextLine();

                    if(yon_islem.equals("q"))
                    {
                        System.out.println("Yönetici İşlemleri Sonlandırılıyor..");
                        break;
                    }
                    else if(yon_islem.equals("1"))
                    {
                        System.out.print("Zam Miktarını Giriniz: ");
                        int zam=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam);
                    }
                    else if(yon_islem.equals("2"))
                    {
                        yonetici.bilgilerigoster();
                    }
                    else
                    {
                        System.out.println("Geçersiz Yonetici İşlemi");
                    }

                }


            }
            else
            {
                System.out.println("Geçersiz İşlem..");
            }





        }



    }


}
