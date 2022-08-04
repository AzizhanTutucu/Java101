import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        double km,normalTutar,yasİndirimOranı,yasİndirimi,yolculukİndirimOranı,yolculukİndirimi,indirimliTutar,toplamTutar;
        int select,yas ;
        double kmUcret = 0.10;
        

        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuk tipini seciniz. \n1-Tek Yon 2- Cift Yon ");
        select=input.nextInt();

        System.out.print("Km giriniz: ");
        km= input.nextDouble();

        System.out.print("Yas giriniz: ");
        yas = input.nextInt();

        if (km>0 && yas>0 && (select==1 || select ==2)){
            if (yas<12 && select==2){
                yasİndirimOranı = 0.5;
                yolculukİndirimOranı=0.2;
                normalTutar = (km*kmUcret);
                yasİndirimi = normalTutar*yasİndirimOranı;
                indirimliTutar = normalTutar-yasİndirimi;
                yolculukİndirimi = indirimliTutar * yolculukİndirimOranı;
                toplamTutar = (indirimliTutar-yolculukİndirimi)*2;
                System.out.println("Normal Ucret: " +normalTutar);
                System.out.println("Yolculuk ucreti : "+toplamTutar);
            } else if ((yas<=24 && yas>=12) && select==2 ) {
                yasİndirimOranı= 0.1;
                yolculukİndirimOranı=0.2;
                normalTutar = (km*kmUcret);
                yasİndirimi = normalTutar*yasİndirimOranı;
                indirimliTutar = normalTutar-yasİndirimi;
                yolculukİndirimi = indirimliTutar * yolculukİndirimOranı;
                toplamTutar = (indirimliTutar-yolculukİndirimi)*2;
                System.out.println("Normal Ucret: " +normalTutar);
                System.out.println("Yolculuk ucreti : "+toplamTutar);
            } else if (yas>65 && select==2) {
                yasİndirimOranı= 0.3;
                yolculukİndirimOranı=0.2;
                normalTutar = (km*kmUcret);
                yasİndirimi = normalTutar*yasİndirimOranı;
                indirimliTutar = normalTutar-yasİndirimi;
                yolculukİndirimi = indirimliTutar * yolculukİndirimOranı;
                toplamTutar = (indirimliTutar-yolculukİndirimi)*2;
                System.out.println("Normal Ucret: " +normalTutar);
                System.out.println("Yolculuk ucreti : "+toplamTutar);
            } else if (yas<12 && select==1) {
                yasİndirimOranı = 0.5;
                normalTutar = (km*kmUcret);
                yasİndirimi = normalTutar*yasİndirimOranı;
                indirimliTutar = normalTutar-yasİndirimi;
                System.out.println("Normal Ucret: " +normalTutar);
                System.out.println("Yolculuk ucreti : "+indirimliTutar);

            } else if ((yas<=24 && yas>=12) && select==1) {
                yasİndirimOranı = 0.1;
                normalTutar = (km*kmUcret);
                yasİndirimi = normalTutar*yasİndirimOranı;
                indirimliTutar = normalTutar-yasİndirimi;
                System.out.println("Normal Ucret: " +normalTutar);
                System.out.println("Yolculuk ucreti : "+indirimliTutar);
            } else if (yas>65 && select==1) {
                yasİndirimOranı = 0.3;
                normalTutar = (km*kmUcret);
                yasİndirimi = normalTutar*yasİndirimOranı;
                indirimliTutar = normalTutar-yasİndirimi;
                System.out.println("Normal Ucret: " +normalTutar);
                System.out.println("Yolculuk ucreti : "+indirimliTutar);
            }
        }else {
            System.out.println("Hatalı giris yaptiniz.");
        }
        
        
    }
}
