public class RotateArray{

    public static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

    public static void rotate_array(int[] arr, int n , int k){
        k = k%n; 
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

    }

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int k = 2;
        rotate_array(arr, n, k);
        print(arr);

    }
}