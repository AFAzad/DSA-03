
public class SecondMaxVal {
    public static void main(String[] args) {
        int[] a = { 4, 6, 3, 15, 7, 9, 13, 17 };
        int temp;
        for (int i = 0; i < a.length; i++){
            for(int j = i+1; j<a.length;j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Array Sorted");
        for(int i =0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Second largest val "+ a[1]+" ");
    }
    

    
}
