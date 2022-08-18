import java.util.Arrays;
import java.util.Scanner;

public class DiziMaxMin {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(list));
        System.out.println("Sayi Giriniz: ");
        number= input.nextInt();
        int max = list[0];
        int min = list[0];

        for (int i : list){
            if (i<number){
                min=i;


            }
            if (i>number){
                max=i;
                break;
            }


        }
        System.out.println("Girilene en yakin kucuk deger : "+ min);
        System.out.println("Girilene en yakin buyuk deger : "+ max);
    }
}
