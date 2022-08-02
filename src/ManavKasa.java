import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutKg,elmaKg,domatesKg,muzKg,patlıcanKg;
        double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlıcanFiyat,toplam;
        double armutKgFiyat=2.14;
        double elmaKgFiyat=3.67;
        double domatesKgFiyat= 1.11;
        double muzKgFiyat= 0.95;
        double patlıcanKgFiyat=5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kac Kilo: ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kac Kilo: ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kac Kilo: ");
        domatesKg = input.nextDouble();
        System.out.print("Muz Kac Kilo: ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan Kac Kilo: ");
        patlıcanKg = input.nextDouble();

        armutFiyat = armutKg*armutKgFiyat;
        elmaFiyat = elmaKg*elmaKgFiyat;
        domatesFiyat= domatesKg*domatesKgFiyat;
        muzFiyat=muzKg*muzKgFiyat;
        patlıcanFiyat = patlıcanKg*patlıcanKgFiyat;

        toplam= patlıcanFiyat+muzFiyat+domatesFiyat+elmaFiyat+armutFiyat;
        System.out.print("Toplam Tutar : "+toplam );

    }
}
