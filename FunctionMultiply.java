import java.util.*;
public class FunctionMultiply {

    public static int multiplyProduct(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The multiply of the two product is: "+multiplyProduct(a, b));
    }
}
