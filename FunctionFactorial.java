import java.util.*;
public class FunctionFactorial {
    public static void factorialFind(int n){
        // loop
        // condition for negtive number 
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;

        for(int i=n; i>1; i--){
            factorial = factorial*i;
        }
        // Print the the number input
        System.out.println("Type any number to find factorial: "+factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorialFind(n);
    }
}
