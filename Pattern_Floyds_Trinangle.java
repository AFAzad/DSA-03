// Q no. 1: Print the pattrtn of Floyd's Triangle.
public class Pattern_Floyds_Trinangle {
    public static void main(String[] args){
    
        int n = 5; 
        int num = 1;

        for(int i=1; i <=n; i++){

            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }



    }
}
