import java.util.Scanner;

public class RecursiveAsalSayilar {

    static void asal(int number,int i){
        if (number==i ){
            System.out.println(number + " Sayi Asaldir.");
            return;
        } else if (number%i ==0 ) {
            System.out.println("Sayi Asal Degildir.");
            return;
        }
        asal(number,i+1);
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int number = src.nextInt();
        asal(number,2);
    }
}
