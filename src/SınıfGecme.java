import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args) {
        int turkce,mat,fizik,kimya,bio;
        double toplam=0.0 ;
        double dersSayisi = 0;
        double ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        if (mat>0&&mat<=100){
            toplam+=mat;
            dersSayisi++;
        }else {
            System.out.println("Mat notu ortalamaya katılmaz");
        }
        System.out.print("Turkce notunu giriniz: ");
        turkce = input.nextInt();
        if (turkce>0&&turkce<=100){
            toplam+=turkce;
            dersSayisi++;
        }else {
            System.out.println("Turkce notu ortalamaya katılmaz");
        }
        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if (fizik>0&&fizik<=100){
            toplam+=fizik;
            dersSayisi++;
        }else {
            System.out.println("Fizik notu ortalamaya katılmaz");
        }
        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if (kimya>0&&kimya<=100){
            toplam+=kimya;
            dersSayisi++;
        }else {
            System.out.println("Kimya notu ortalamaya katılmaz");
        }
        System.out.print("Bio notunu giriniz: ");
        bio = input.nextInt();
        if (bio>0&&bio<=100){
            toplam+=bio;
            dersSayisi++;
        }else {
            System.out.println("Bio notu ortalamaya katılmaz");
        }
        ort = toplam/dersSayisi;

        if (ort<=55){
            System.out.println("Kaldınız.");
        }else {
            System.out.println("Gectiniz.");
        }
        System.out.println("Ortalamaniz: "+ort);
    }
}
