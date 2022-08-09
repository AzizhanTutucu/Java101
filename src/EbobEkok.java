import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayisini giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz : ");
        int n2 = input.nextInt();
        int smallN,bigN,ebob,ekok;

        if (n2<n1){
            smallN = n2;
            bigN = n1;

        }else {
            smallN= n1;
            bigN = n2;

        }
        int i= smallN;
        while (smallN>=1){
            if (n1%i==0 && n2%i==0){
                ebob = i;
                System.out.println("Ebob: "+ebob);
                break;
            }
            i--;
        }
        int k = 1;
        while (k<= n1*n2){
            if (k% n1 ==0 && k%n2==0){
                ekok=k;
                System.out.println("Ekok : "+ ekok);
                break;
            }
            k++;
        }


    }
}
