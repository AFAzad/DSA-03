import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many values you wants?");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element your are searching");

        int target = sc.nextInt();

        int position=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position=i;
                break;
            }
        }
        if(position!=-1)
        System.out.println(target + " Found at position " + (position+1));
        else
        System.out.println("Sorry ! Entered Element not found");


    }
}
