import java.util.*;
/*Write a function to print the sum of odd numbers from 1 to n */
public class PrintOdd {

    public static void printOddNum(int n){
        int result = 0;

        for(int i=1; i<=n; i++){
            if(i %2 !=0){
                result = result + i;
            }
        }
        System.out.println(result);
    }

    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        printOddNum(n);
    }
}
