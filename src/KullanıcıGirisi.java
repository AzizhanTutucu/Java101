import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        String userName,password,select,newPassword;
        String realPassword= "java123";
        String realUserName = "patika";
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici adini giriniz:");
        userName = input.nextLine();
        System.out.print("Sifre giriniz: ");
        password = input.nextLine();
        if (userName.equals(realUserName) && password.equals(realPassword)){
            System.out.println("Giris Yaptiniz.");

        }else {
            System.out.println("Kullanici adi veya sifre hatali. Yeni sifre belirlemek icin \'yes\' istemezseniz \"no\" seciniz.\n" +
                    "yes\nno");
            select = input.nextLine();
            if (select.equals("no")){
                System.out.println("Giris sonlandirildi.");
            } else if (select.equals("yes")) {
                System.out.println("Yeni sifre giriniz:");
                newPassword = input.nextLine();
                if (newPassword.equals(realPassword)){
                    System.out.println("Sifre olusturulamadi, lütfen baska sifre giriniz.");

                }else {
                    realPassword= password;
                    System.out.println("Yeni sifre olusturuldu.");
                }
            }
        }
    }
}
