public class HarmonikDizi {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double harmonik =0.0;
        double harmonikOrt = 0.0;


        for (int i=0 ; i< list.length;i++) {
            harmonik += (1.0 / list[i]);
            harmonikOrt = list.length / harmonik;
        }
        System.out.println(harmonik);
        System.out.println(harmonikOrt);
    }
}
