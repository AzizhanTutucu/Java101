import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        double kdvliTutar,kdvsizTutar,tutar,kdvTutari;
        double kdv = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz:" );
        tutar = input.nextInt();

        kdvliTutar=  (tutar + (tutar*kdv));
        kdvsizTutar= tutar;
        kdvTutari =  ( tutar*kdv);

        System.out.println("Kdvsiz tutar: "+ kdvsizTutar);
        System.out.println("Kdvli tutar: "+ kdvliTutar);
        System.out.println("Kdv tutari: "+ kdvTutari);
    }
}
