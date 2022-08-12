public class Palindrom {

    static boolean isPalidrom(int number){
        int temp =number; int reverseNumber=0,lastMember;
        while (temp!=0){
                lastMember=temp%10;
                reverseNumber= (reverseNumber*10)+lastMember;

                temp/=10;
        }
        if (reverseNumber==number){
            System.out.println(number + " Polidrom Sayidir.");
            return true;
        }else {
            System.out.println(number + " Polidrom Sayi Degildir.");
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalidrom(705));

    }
}
