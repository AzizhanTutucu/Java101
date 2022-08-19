import java.util.Arrays;

public class DizilerdeElemanFrekansi {

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int sayac = 1, a = 0;
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (list[i] != a) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        sayac++;
                        a = list[i];
                    }
                }

                System.out.println(list[i] + "Sayisi " + sayac + " kere tekrar etti.");
                sayac = 1;
            }
        }
    }
}





