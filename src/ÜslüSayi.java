import java.util.Scanner;

public class ÜslüSayi {
    public static void main(String[] args) {
        int n,k;
        int total=1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Ussu alinacak Sayi :");
        n = scn.nextInt();
        System.out.print("Us alinacak Sayi :");
        k = scn.nextInt();
        for (int i=1 ; i<=k;i++){
            total*=n;
        }
        System.out.println("Us: " + total);

    }
}
