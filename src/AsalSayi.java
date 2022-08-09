import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 2 ; i<=100 ; i++){
            boolean isPrime = false;
            for (int j = 2 ; j < i ; j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }else {
                    isPrime=true;
                }
            }
            if (isPrime==true){
                System.out.println("Asal Sayilar :  " + i);
            }
        }

    }
}
