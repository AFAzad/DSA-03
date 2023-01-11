import java.util.*;
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
