import java.util.*;


//Q.1 Print the pattern __Half Pyramid. 

public class HalfPyramid_3 {
    public static void main(String[] args){
        int n = 4;

        System.out.println("Half Pyramid");

        //Outer loop
        for(int i =1;i <= n; i++){

            //Inner loop
            for(int j =1; j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
        
        

        //Q.2 Print the pattern __Inverted Half Pyramid. 

        
        //Inverted Half Pyramid
        System.out.println("Inverted Half Pyramid");

        for(int i =n;i >=1; i--){

            //Inner loop
            for(int j =1; j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }


        //Q 3. Print the pattern __ Pyramid. 

        System.out.println(" Pyramid ");

        for(int i =1; i<=n; i++){


            //inner loop for Space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

           // inner loop for Star

           for(int j=1; j <=i; j++){
            System.out.print("*"+" ");
           }
           System.out.println();
        }

    }
}
