import java.util.*;
// Q. take an array of names as input from the user and Print them on the screen.
public class print_Name_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();

       String names[]= new String[size];

        // for input 
       for(int i=0; i<size; i++){
        names[i] = sc.next();
    }
    // output
    for(int i=0; i<names.length; i++){
        System.out.println((i+1)+ names[i]);
    }

    }
}
