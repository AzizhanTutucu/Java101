import java.util.Arrays;
import java.util.Scanner;

public class DizilerdeKucuktenBuyuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz : ");
        int size = input.nextInt();
        System.out.print("Dizi elemanlarini giriniz : ");
        int[] list = new int[size];

        for (int i =0 ; i<list.length; i++){
            list[i]= input.nextInt();

        }
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));


    }
}
