import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kac Sayi Gireceksiniz :");
        int counter = scn.nextInt();
        int max =1 , min= 1;
        for (int i = 1 ; i<= counter ;i++){
            System.out.print(i+" Sayi giriniz : ");
            int number = scn.nextInt();
            if (i==1){
                max=number;
                min=number;
            }else if (number <min){
                min = number;

            }else if (number>max){
                max=number;

            }

        }
        System.out.println("Max : " +max);
        System.out.println("Min : "+ min);
    }
}
