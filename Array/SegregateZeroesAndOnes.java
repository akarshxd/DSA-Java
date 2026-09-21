public class SegregateZeroesAndOnes{
    public static void printArray(int[] arr){
        System.out.print("Array : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    // public static void swap(int[]arr, int i, int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    public static void segregate(int [] arr){
        /*
        int n = arr.length;
        int left = 0, right = n -1; 
        while(left<=right){
            if(arr[right]==0&& arr[left]==1){
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
        }*/

       int NumOfZero = 0;
       for(int ele : arr){
        if(ele==0) NumOfZero++;
       }

       for(int i = 0; i<NumOfZero; i++){
        arr[i]= 0;
       }
       for(int i = NumOfZero; i<arr.length; i++){
        arr[i]= 1;
       }
       


    }
        public static void main(String[] args) {
        int [] arr = {1, 0, 1, 0, 1, 0,0, 0, 0, 0, 1};
        printArray(arr);
        segregate(arr);
        printArray(arr);
    }

}