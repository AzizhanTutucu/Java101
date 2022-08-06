import java.util.Scanner;

public class GirilenSayiyaKadar {
    public static void main(String[] args) {
        int number;
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        number = scn.nextInt();
        for (int i =1; i<number; i++){
            if (i%2 ==0){
                System.out.println("Girilen Sayiya Kadar 2'nin Katlari: "+ i);
            }
        }
    }
}
