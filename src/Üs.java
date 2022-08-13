import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Üs {

    static int power(int n1, int n2){
        int result = 1;
        for (int i = 1 ; i <= n2 ; i++){
            result *= n1;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayisini giriniz : ");
        int n1 = input.nextInt();
        System.out.print("Us sayisini giriniz : ");
        int n2 = input.nextInt();
        System.out.println("Sonuc : " + power(n1,n2));

    }
}
