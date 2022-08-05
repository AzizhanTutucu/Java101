import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {
        int sayi;
        double ortalama;
        int toplam=0;
        int adet = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();
        for (int i = 0; i<=sayi; i++){

                if ((i%3 == 0) && (i% 4 ==0)){
                    toplam = toplam+i;
                    adet++;

                }



            }
        ortalama= toplam/adet;
        System.out.println("Ort : "+ ortalama);

        }

    }

