public class Yazlimci extends Calisan{
    private String diller;

    public Yazlimci(String ad, String soyad, int id,String diller)
    {

        super(ad,soyad,id);
        this.diller=diller;
    }

    public void formatat(String isletim_sistemi)
    {
        System.out.println(getAd()+" "+ isletim_sistemi+"'ni yüklüyor....");
    }
    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("Yazılımcının Bildiği Diller: "+diller);
    }
}
