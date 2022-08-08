import java.util.Scanner;

public class YildizlarİleElmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayisi Giriniz: ");
        int number = inp.nextInt();
        for (int i = 1 ; i<= number ; i++){
            for (int j =1 ; j<= (number-i) ; j++){
                System.out.print(" ");
            }

            for (int k = 1 ; k<= (i*2)-1; k++){
                System.out.print("*");

            }
            System.out.println();
        }
        for (int a = 1; a<number; a++){
            for (int b = 1; b<= a-1; b++){
                System.out.print(" ");
            }
            for (int c = 1 ; c<= (2*number -(2*a - 1)) ; c++ ){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
