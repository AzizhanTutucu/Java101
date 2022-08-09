import java.util.Scanner;

public class Bankamatik {
    public static void main(String[] args) {
        String reelUserName = "patika", reelPassword = "dev123";
        String userName,password;
        int right = 3;
        int select ;
        int price;
        int balance = 1500;

        while (right>0){
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanici adi giriniz: ");
            userName= input.nextLine();
            System.out.print("Sifre giriniz: ");
            password = input.nextLine();
            if (userName.equals(reelUserName) && password.equals(reelPassword)){
                System.out.println("Bankaya Hosgeldiniz.");

                System.out.println("1-Para Cekmek\n2-Para Yatirma\n3-Bakiye Sorgulama\n4-Cikis Yapma");

               do {
                   System.out.print("Yapmak istediginiz islemi giriniz: ");
                   select = input.nextInt();
                   switch (select){
                       case 1:
                           System.out.print("Tutar Giriniz :");
                           price = input.nextInt();
                           balance+=price;
                           break;
                       case 2:
                           System.out.print("Tutar Giriniz :");
                           price = input.nextInt();
                           if (price > balance){
                               System.out.println("Bakiye Yetersiz");
                           }else {
                               balance-=price;
                           }
                           break;
                       case 3:
                           System.out.println("Bakiyeniz: " + balance);
                           break;
                       case 4:
                           System.out.println("Cikis Yapildi.");
                           break;



                   }
               }while (select!=4);
                System.out.println("Tekrar Gorusmek Uzere.");
                break;
            }else {
                right--;
                System.out.println("Hatali giris yaptiniz.");

            }
            if (right==0){
                System.out.println("Hesap Blokelendi.");
            }else {
                System.out.println("Kalan Hakkiniz: " + right);
            }


        }
    }
}
