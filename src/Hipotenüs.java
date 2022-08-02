import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
        double a,b,c,ucgeninCevresi,u,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar: ");
        a = input.nextDouble();
        System.out.print("2. Kenar: ");
        b = input.nextDouble();
        System.out.print("3. Kenar: ");
        c= input.nextDouble();

        u= (a+b+c)*2;
        ucgeninCevresi= 2*u;

        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan: "+alan);



    }

}
