import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");

        int n = sc.nextInt();


        //Declering the array


        int[] arr = new int[n];


        System.out.println("Enter the element which You want to search ");

        for(int i =0; i <n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter that Element you are searching");

        int num = sc.nextInt();

        int low =0;
        int high= n-1;
        int mid =0;


        while(low <=high){
            mid = (low+high)/2;
            if(arr[mid]==num){
                System.out.println("Element is found at index  "+mid);
                break;
            }else if(arr[mid]>num){
                high = mid-1;
            }else if(arr[mid]<num){
                low=mid+1;
            }
            
        }
        if(low>high){
            System.out.println("Element did not found");
        }

    }
}
