import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        number = inp.nextInt();
        double result = 0.0;
        for (double i = 1 ; i<=number; i++){
            result += (1/i);
        }
        System.out.println("Harmonik Degeri: " + result);
    }
}
