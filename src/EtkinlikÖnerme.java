import java.util.Scanner;

public class EtkinlikÖnerme {
    public static void main(String[] args) {
        double  heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz: ");
        heat = input.nextDouble();
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat<=25&&heat>=5) {
            if (heat>=5 && heat<=10){
                System.out.println("Sinemaya gidebilrisiniz.");
            }
            if (heat<=15 && heat>10) {
                System.out.println("Sinemaya gidebilirsiniz veya piknige gidebilirsiniz.");
            }
            if (heat>15 && heat<=25) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }

        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
