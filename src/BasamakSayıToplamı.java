import java.util.Scanner;

public class BasamakSayıToplamı {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scn.nextInt();
        int tempSayi = sayi;
        int basSayi;
        int result= 0;
        while (tempSayi!=0){
            basSayi = tempSayi%10;
            tempSayi /=10;
            result += basSayi;
        }
        System.out.println("Toplam: " +result);

    }
}
