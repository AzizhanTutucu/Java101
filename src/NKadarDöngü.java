import java.util.Scanner;

public class NKadarDöngü {

    static void döngü(int n){
            if (n>0){
                System.out.print(n+ " ");
                döngü(n-5);
            }
        System.out.print(n+ " ");
        }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir n degeri giriniz: ");
        int n = input.nextInt();
        döngü(n);
    }
}
