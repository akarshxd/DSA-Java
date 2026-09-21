/*public class reverseArray{
    public static void reverse(int[]arr, int l, int r){
        if(l>=r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int l = 0;
        int r = arr.length - 1; 
        reverse(arr, l, r);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

*/

public class reverseArray{
    public static void reverse(int[]arr, int i){
        int n = arr.length;
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse(arr, i+1);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6}; 

        reverse(arr, 0);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}