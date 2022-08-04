import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        String dogumAyi;
        int dogumGünü;
        String burc = "";
        boolean isError=false;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogum ayi yaziniz(Turkce karakter girmeyiniz) :");
        dogumAyi = input.nextLine();
        System.out.print("Dogum gunu giriniz: ");
        dogumGünü= input.nextInt();


        if (dogumAyi.equals("Ocak")){
            if (dogumGünü>=1 && dogumGünü<=31){
                if (dogumGünü<22){
                    burc = "Oglak";
                }
                else {
                    burc="Kova";

                }
            }else {
                isError=true;
            }

        } else if (dogumAyi.equals("Subat")) {
            if (dogumGünü>=1 && dogumGünü<=29){
                if (dogumGünü<=19){
                    burc="kova";
                }else {
                    burc="Balık";
                }
            }else {
                isError=true;
            }

        } else if (dogumAyi.equals("Mart")) {
            if (dogumGünü>=1 && dogumGünü<=31){
                if (dogumGünü<=21){
                    burc="Balık";

                }else {
                    burc="Koc";
                }

            }else {
                isError=true;
            }
        } else if (dogumAyi.equals("Nisan")) {
            if (dogumGünü>=1 && dogumGünü<=30){
                if (dogumGünü<=20) {
                    burc = "Koc";
                }else {
                    burc="Boga";
                }
            }else {
                isError=true;
            }

        } else if (dogumAyi.equals("Mayıs")) {
            if (dogumGünü>=1 && dogumGünü<=31){
                if (dogumGünü<=21){
                    burc="Boga";
                }else {
                    burc="İkizler";
                }
            }else {
                isError=true;
            }
        } else if (dogumAyi.equals("Haziran")) {
            if (dogumGünü>=1 && dogumGünü<=30){
                if (dogumGünü<=22){
                    burc="İkizler";
                }else {
                    burc="Yengec";
                }
            }else {
                isError=true;
            }
        } else if (dogumAyi.equals("Temmuz")) {
            if (dogumGünü>=1 && dogumGünü<=31){
                if (dogumGünü<=22){
                    burc="Yengec";
                }else
                    burc="Aslan";
            }else {
                isError=true;
            }
        } else if (dogumAyi.equals("Agustos")) {
            if (dogumGünü>=1 && dogumGünü<=31){
                if (dogumGünü<=22){
                    burc="aslan";

                }else {
                    burc="Basak";
                }
            }else {
                isError=true;
            }
        } else if (dogumAyi.equals("Eylül")) {
            if (dogumGünü>=1 && dogumGünü<=30){
                if (dogumGünü<=22){
                    burc="Basak";
                }else {
                    burc="Terazi";
                }
            }else {
                isError=true;
            }
        } else if (dogumAyi.equals("Ekim")) {
            if (dogumGünü>=1 && dogumGünü<=31){
                if (dogumGünü<=22){
                    burc="Terazi";
                }else {
                    burc="Akrep";
                }
            }else {
                isError=true;
            }
        } else if (dogumAyi.equals("Kasım")) {
            if (dogumGünü>=1 && dogumGünü<=30){
                if (dogumGünü<=21){
                    burc="Akrep";
                }else {
                    burc="Yay";
                }
            }else {
                isError=true;
            }
        } else if (dogumAyi.equals("Aralık")) {
            if (dogumGünü>=1 && dogumGünü<=31){
                if (dogumGünü<=21){
                    burc="yay";

                }else {
                    burc=   "Oglak";
                }
            }else {
                isError=true;
            }
        }

        if (isError==true){
        System.out.println("Hatalı giris yaptiniz.");

        }else {
            System.out.println("Burcunuz : " +burc);


        }
    }

}
