import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        double kdvliTutar,kdvsizTutar,tutar,kdvTutari;
        double kdv = 0.18;
        boolean kdvDurumu;


        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz:" );
        tutar = input.nextDouble();

        kdvDurumu = (0<tutar)&&(tutar<1000);
        kdv= kdvDurumu ? 0.18 : 0.08;

        kdvliTutar=  (tutar + (tutar*kdv));
        kdvsizTutar= tutar;
        kdvTutari =  ( tutar*kdv);

        System.out.println("Kdvsiz tutar: "+ kdvsizTutar);
        System.out.println("Kdvli tutar: "+ kdvliTutar);
        System.out.println("Kdv tutari: "+ kdvTutari);
    }
}
