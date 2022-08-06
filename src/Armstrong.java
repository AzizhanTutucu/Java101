import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Armstrong Hesaplanacak Sayi: ");
        int sayi = scn.nextInt();
        int tempSayi = sayi;
        int basSayi = 0;
        int basDegeri;
        int result = 0;
        while (tempSayi!=0){
            tempSayi /= 10;
            basSayi++;
        }
        tempSayi=sayi;
        while (tempSayi!=0){
            basDegeri = tempSayi %10;
            int basPow = 1;
            for (int i=1 ; i<= basSayi ; i++){
                basPow*= basDegeri;
            }
            result += basPow;
            tempSayi /=10;

        }
        if (result==sayi){
            System.out.println("Amstrong Sayidir. " + result);

        }else {
            System.out.println("Amstrong degildir. "+ result);
        }

    }
}
