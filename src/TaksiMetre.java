import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        double km;
        int acılısUcreti= 10 ;
        Scanner input= new Scanner(System.in);
        System.out.print("Km Bilgisi: ");
        km= input.nextDouble();
        double tutar= (km*2.20) +acılısUcreti;
        boolean minTutar;
        minTutar = (tutar<=20)&(tutar>0);
        tutar = minTutar ? 20: tutar;
        System.out.println("Taksı Ucretı: "+tutar);
    }
}
