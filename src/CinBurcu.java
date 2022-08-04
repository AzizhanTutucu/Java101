import java.util.Scanner;

public class CinBurcu {
    public static void main(String[] args) {
        int dogumYılı;
        boolean isError=false;
        String burc = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Dogum Yilinizi Giriniz: ");
        dogumYılı = input.nextInt();

        if(dogumYılı<=2022 && dogumYılı> 0){
            if (dogumYılı%12==0){
                burc= "Maymun";
            }if (dogumYılı%12==1){
                burc="Horoz";
            }if (dogumYılı%12==2){
                burc="Köpek";
            }if (dogumYılı%12==3){
                burc="Domuz";
            }if (dogumYılı%12==4){
                burc="Fare";
            }if (dogumYılı%12==5){
                burc="Öküz";
            }if (dogumYılı%12==6){
                burc="Kaplan";
            }if (dogumYılı%12==7){
                burc="Tavşan";
            }if (dogumYılı%12==8){
                burc="Ejderha";
            }if (dogumYılı%12==9){
                burc="Yılan";
            }if (dogumYılı%12==10){
                burc="At";
            }if (dogumYılı%12==11){
                burc="Koyun";
            }

        }else {
            isError = true;
        }
        if (isError==true){
            System.out.println("Hatali yil girdiniz.");
        }else {
            System.out.println("Cin Burcunuz: "+ burc);
        }
    }
}
