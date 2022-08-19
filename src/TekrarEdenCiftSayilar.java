import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    static boolean isHas(int[] arr,int value){
        for (int i : arr){
            if (i==value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,2,7,8,8,4,8,12,21,12,4};
        int[] dublicate = new int[arr.length];
        int index = 0;

        for (int i= 0 ; i< arr.length;i++){
            for (int j =0 ; j< arr.length;j++){
                if (arr[i]%2==0 && arr[j] %2==0 && i!=j && arr[i]==arr[j]){
                    if (isHas(dublicate,arr[i])) {
                        dublicate[index++] = arr[i];
                    }
                    break;
                }
            }
        }
        Arrays.sort(dublicate);
        for (int value : dublicate){
            if (value!=0){

                System.out.println(value);
            }

        }
    }
}
