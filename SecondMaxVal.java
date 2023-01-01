public class SecondMaxVal {
    public static void main(String[] args){
        int[] arr = {4, 6, 3, 10, 15, 9, 7, 9, 13, 17};
        int temp;
        for(int i =0;i<arr.length; i++){
            for(int j = i+1; i < arr.length; j++){
                if(arr[i]<arr[j]){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    System.out.println("The second max val is "+arr[1]);
    }
}
