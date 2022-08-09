import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int number = input.nextInt();
        int toplam =0;
        for (int i = 1 ; i <number; i++){
            if (number%i==0){

                toplam+=i;
            }

        }
        if (toplam==number){
            System.out.println("Mukemmel Sayidir. " + toplam);

        }else {
            System.out.println("Mukemmel Sayi Degildir.");
        }
    }
}
