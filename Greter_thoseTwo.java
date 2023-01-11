import java.util.*;
public class Greter_thoseTwo {
    public static void  getMax(int a, int b){
        if(a > b ){
            System.out.println("a is greater b.");
        }else{
            System.out.println("b is greater a.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        getMax(a, b);
    }
}
