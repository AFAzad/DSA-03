import java.util.*;

/*
 Take an Array of numbers as input and check if is an array sorted in acesding or decending order.
 */
public class ArrayCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] numbers = new int[size];

        //Taking input from user in for loop

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i]> numbers[i+1]){
                isAscending = false;
            }

        }

        if(isAscending){
            System.out.println("Sorted array in ascending order");
        }else{
            System.out.println("Array is not sorted in acending order");
        }
    }
}
