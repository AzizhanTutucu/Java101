import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayisi Giriniz: ");
        int number = inp.nextInt();
        for (int a = 1; a<=number; a++) {
            for (int b = 1; b <= a - 1; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * number - (2 * a - 1)); c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
