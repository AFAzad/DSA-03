import java.util.Scanner;
public class PracticstwoD_Array {
    public static void main(String[] Args){
        /*  Problem No.1: Take a matrix as input from the user
        given number x snd print the indices at which it occurs */

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for(int i = 0; i < rows; i++){
            //columns
            for(int j= 0; j< cols;j++){
                numbers[i][j]= sc.nextInt();
            }
        }

        int x 

    }
}
