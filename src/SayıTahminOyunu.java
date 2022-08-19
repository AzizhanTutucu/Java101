import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayıTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] selectedNumbers= new int[5];
        boolean isWin = false;
        boolean isWrong= false;
        while (right<5){
            System.out.println("Lutfen tahmini giriniz: ");
            selected = input.nextInt();
            if (selected<0 || selected>99){
                System.out.println("0-100 arasinda bir sayi giriniz.");
                if (isWrong){
                    System.out.println("Cok fazla hatali sayi girdiniz. Kalan hakkiniz : "+ (5-(++right)));
                }else {
                    isWrong=true;
                    System.out.println("Bir daha hatali sayi girerseniz hakkinizden dusecektir.");
                }
                continue;

            }
            if (selected==number){
                System.out.println("Tebrikler Dogru Tahmin : "+ number);
                isWin=true;
                break;

            }else {
                selectedNumbers[right]= selected;
                right++;
                System.out.println("Yanlis tahmin.");
                System.out.println("Kalan hakkiniz : " + (5-right));
                if (selected>number){
                    System.out.println("Gizli sayidan buyuk sayi girdiniz.");
                }else {

                    System.out.println("Gizli sayidan kucuk sayi girdiniz.");
                }

            }

        }
        if (!isWin && !isWrong){
            System.out.println("Kaybettiniz.");
            System.out.print("Yaptiginiz tahminler: ");
            System.out.println(Arrays.toString(selectedNumbers));
        }


    }
}
