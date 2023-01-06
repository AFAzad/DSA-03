import java.util.*;

// Q. no.1 Print the Pattern: Inverted Half Pyramid with number.
public class InvertedHalfPym_Num {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<= n; i++){
            
            // innerr Loop
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j);
            } 
            System.out.println();
        }
     
        


    // Q no. 2 : Print the pattern - Half Pyramid with numbers.

    System.out.println("Half Pyramid with numbers");
    
        for(int i =1; i <=n; i++){

            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
