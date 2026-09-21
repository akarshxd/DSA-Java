// Sort an Array that is consisting only 0 and1.

/* Brute Force :

public class SortZerosAndOnes{
    public static void printArray(int[] arr){
        System.out.println("Array : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void sortzeroandone(int [] arr){
        int n = arr.length;
        int zeroes = 0; // to count the zeroes
        for(int i = 0; i<n; i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i = 0; i<n; i++){
            if(i<zeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }

        }

    }
    public static void main(String[] args) {
        int [] arr = {1, 0, 1, 0, 1, 0,0, 0, 0, 0, 1};
        printArray(arr);
        sortzeroandone(arr);
        printArray(arr);
    }
}

*/

//Optimal 
public class SortZerosAndOnes{
    public static void printArray(int[] arr){
        System.out.println("Array : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortzeroandone(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left]==1&& arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }  

    }
    public static void main(String[] args) {
        int [] arr = {1, 0, 1, 0, 1, 0,0, 0, 0, 0, 1};
        printArray(arr);
        sortzeroandone(arr);
        printArray(arr);
    }
}
