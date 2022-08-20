package MayınTarlası;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int total;
   int rowNo;
   int colNo;
   int mine;
   String[][] mineZone;
   String[][] game;
   boolean isFinish;

    MineSweeper(int row, int col){
        this.colNo=col;
        this.rowNo=row;
        this.game= new String[row][col];
        this.mineZone= new String[row][col];
        this.isFinish=false;

    }
    public void game(){
        for (int i =0 ; i<this.game.length ; i++){
            for (int j=0 ; j<this.game[i].length; j++){
                this.game[i][j] = "-";
                this.mineZone[i][j]="-";
            }
        }
    }
    public void mineZone(){
        Random random = new Random();
        this.mine = (this.rowNo*this.colNo)/4;
        for (int i = 0 ; i<this.mine; i++){
            int randRow = random.nextInt(rowNo);
            int randCol = random.nextInt(colNo);
            if (mineZone[randRow][randCol]=="*"){
                i--;
            }else {
                mineZone[randRow][randCol]="*";
            }
        }
    }
    public void print(int n){
        if (n==1){
            System.out.println("Placed Mine : ");
            print(mineZone);
            System.out.println("===================");
            System.out.println("Welcome To The Game");
        }else{
            print(game);
        }
    }
    public void print(String[][] arr){
        for (String[] list : arr){
            for (String lst :list){
                System.out.print(lst+" ");
            }
            System.out.println("");
        }
    }

    public int check(int row, int col){
        int sum =0;
        for (int i =-1 ; i< 2; i++ ){
            for (int j =-1 ; j<2; j++){
                if (row+i <0 || col+j<0 || row+i >= game.length || col+j>= game[0].length  ){
                    continue;
                }

                if (mineZone[row+i][col+j]=="*"){
                    sum++;
                }
            }
        }
        return sum;
    }
    public void run(){

        game();
        mineZone();

        this.total= (this.colNo*this.rowNo)-this.mine;
        Scanner input = new Scanner(System.in);
        while (!isFinish){
            print(0);
            System.out.print("Satir giriniz: ");
            int row = input.nextInt();
            System.out.print("Sutun giriniz : ");
            int col= input.nextInt();
            if (row<0 || col<0 || row >= this.rowNo|| col>=this.colNo){
                System.out.println("Araliklar arasinda sayi giriniz.");
                continue;
            }else {
                if (mineZone[row][col].equals("*")){
                    System.out.println("Game Over!!!");
                    isFinish=true;
                    break;
                }
                else {
                    total--;
                }
                if (total<=0){
                    System.out.println("You Won The Game");
                    print(1);
                    break;
                }else {
                    int count = check(row,col);
                    this.game[row][col] = String.valueOf(count);
                }
            }
        }
    }

}
