import java.util.Scanner;

public class KücüktenBüyüge {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayiyi giriniz.");
        a= input.nextInt();
        System.out.print("2. Sayiyi giriniz.");
        b= input.nextInt();
        System.out.print("3. Sayiyi giriniz.");
        c= input.nextInt();

        if (a<b && a<c) {
            if (b < c) {
                System.out.println("a<b<c");
            }
            if (c < b) {
                System.out.println("a<c<b");
            }
        } else if (b<a && b<c) {
            if (a<c){
                System.out.println("b<c<a");
            }if (c<a){
                    System.out.println("b<a<c");
                }

        } else if (c<b && c<a) {
                if (a<b){
                    System.out.println("c<a<b");

                }else{
                    System.out.println("c<b<a");
                }

                }

        }
}
