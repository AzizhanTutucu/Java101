import java.util.Scanner;

public class Combinassion {
    public static void main(String[] args) {
        int fakt1=1, fakt2=1, faktFark=1,firstNumber,secondNumber,C;
        Scanner scn = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz:");
        firstNumber = scn.nextInt();
        System.out.print("İkinci Sayiyi Giriniz:");
        secondNumber = scn.nextInt();
        for (int i = 1; i<=firstNumber;i++){
            fakt1*=i;
        }for (int k=1 ;k<=secondNumber;k++){
            fakt2*=k;
        }for (int j=1; j<=(firstNumber-secondNumber);j++){
            faktFark*=j;
        }
        C= fakt1/(fakt2*(faktFark));
        System.out.println("Kombinasyon : " + C);

    }
}
