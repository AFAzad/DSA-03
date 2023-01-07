import java.util.*;
//Q. Print the Diamond_Pattern.
public class DiamondPattern {
    public static void main(String[] args){
        int n = 5;

        //Upper Half
        for(int i=1; i<=n; i++){

            // Print Spaces 
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Print Stars
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for(int i=n; i>=1; i--){

            // Print Spaces 
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Print Stars
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
