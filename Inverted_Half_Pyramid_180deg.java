import java.util.*;
public class Inverted_Half_Pyramid_180deg {
    public static void main(String[] args){
        int n = 5;  // n is number of row
        //Outer loop
        for(int i=1; i <=n;i++){

            //Innner loop for Space Print
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }


            //Inner loop for Star Print
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
