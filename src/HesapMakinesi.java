import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double number1,number2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        number1= input.nextDouble();
        System.out.print("1. sayiyi giriniz: ");
        number2= input.nextDouble();

        System.out.println("1.toplama\n2.Cikarma\n3.Carpma\n4.Bolme");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama: "+ (number1+number2));
                break;
            case 2:
                System.out.println("Cikarma: "+ (number1-number2));
                break;
            case 3:
                System.out.println("Carpma: "+ (number1*number2));
                break;
            case 4:
                if (number2==0){
                    System.out.println("Bir sayi 0'a bolunemez.");
                }

                System.out.println("Bolme: "+ (number1/number2));
                break;
            default:
                System.out.println("Gecersiz islem sectiniz.");

        }
    }
}
