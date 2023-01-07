import java.util.*;
// Q. Print the Pattern of Palindrome Pattern.
public class Pattern_Paindrome {
    public static void main(String[] args){
        int n = 5;
        
        for(int i=1; i<=n; i++){
            
            //Print Spaces (n-i)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // We are diving the number in two parts : 1st half will column 1 to 5 and 2nd Half will columns 6 to 9.

            // Print 1st Half numbers .
            // for(j=i to ) --> numbers are going backward

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // Print 2 Half numbers
            // --> for j = 2 to i
            // numbers are going forward

            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();


        }
    }
}
