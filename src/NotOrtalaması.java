import java.util.Scanner;


public class NotOrtalaması {
    public static void main(String[] args) {
        int mat,fizik,tarih,kimya,türkce;
        Scanner input = new Scanner(System.in);

        System.out.print("Mat notunu giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik = input.nextInt();


        System.out.print("Tarih notunu giriniz:");
        tarih = input.nextInt();


        System.out.print("Kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.print("Turkce notunu giriniz:");
        türkce = input.nextInt();

        int toplam = (mat+fizik+tarih+kimya+türkce);
        double sonuc = toplam/6;
        System.out.println("Ortalamaniz:"+ sonuc);

        String str= sonuc>=60 ? "Gectiniz" : "Kaldiniz";
        System.out.println(str);



    }
}
