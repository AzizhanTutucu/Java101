import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        //double alan,cevre;
        double r,a,daireDilimAlanı;

        double pi=3.14;
        Scanner input= new Scanner(System.in);
        System.out.print("Yaricap giriniz:");
        r= input.nextDouble();
        System.out.print("Merkez aci olcusu giriniz: ");
        a= input.nextDouble();
        //alan=pi*r*r;
        //cevre= 2*pi*r;
        //System.out.print("Alan: "+alan);
        //System.out.print("Cevre: "+cevre);

        daireDilimAlanı= (pi*(r*r)*a)/360;
        System.out.println("Daire dilim alani: "+daireDilimAlanı);
    }
}
