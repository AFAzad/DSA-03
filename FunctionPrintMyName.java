import java.util.*;
public class FunctionPrintMyName {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    //main function/ primary function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         String name = sc.next();

         printMyName("Your name is : "+name);// caling the function 
    }

}
