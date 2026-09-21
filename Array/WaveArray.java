class WaveArray{
    static void swap(int[]arr, int start, int end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
    }
    static void wave(int [] arr){
        int n = arr.length;
        
        for (int i = 0; i <n; i+=2) {
            if(i==n-1) break;
            swap(arr, i, i+1); 
                   
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        wave(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}