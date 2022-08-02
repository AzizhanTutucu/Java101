import java.util.Scanner;

public class VucudIndex {
    public static void main(String[] args) {
        double kilo,vucudIndex,boy;
        Scanner input =new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg olarak giriniz: ");
        kilo= input.nextDouble();
        vucudIndex= kilo/(boy*boy);
        System.out.println("Vucud İndexiniz: " + vucudIndex);

    }
}
