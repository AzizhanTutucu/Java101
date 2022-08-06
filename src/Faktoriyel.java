import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Faktoriyel {
    public static void main(String[] args) {
        int number;
        int fakt= 1;
        Scanner scn = new Scanner(System.in);
        number = scn.nextInt();
        for (int i= 0; i<=number;i++){
            if (i>0){
                fakt *=i;
                System.out.println(fakt);
            }

        }

    }
}
