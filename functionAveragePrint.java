import java.util.Scanner;
/* Enter 3 number from the user & make a function to print their average */

public class functionAveragePrint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a + b + c)/3;
        System.out.println("The average of a , b and c is: "+average);
    }
}
