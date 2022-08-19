import java.util.Arrays;

public class MatrisTranspoz {
    static int[][] traspoz(int[][] matrix){
        int [] [] transpoz = new int[matrix[0].length][matrix.length];
        for (int i = 0 ; i<matrix.length;i++){
            for (int j =0 ; j<matrix[0].length;j++){
                transpoz[j][i]=matrix[i][j];
            }

        }
        return transpoz;

    }
    static void print(int[][] matrix){
        for (int i = 0 ; i< matrix.length;i++){
            for (int j =0 ; j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {2,3,4},
            {5,6,4}
        };
        System.out.println("Matrix : ");
        print(matrix);
        System.out.println("Transpoz: ");
        print(traspoz(matrix));




    }
}
