import java.util.*;

public class RotatebyK{

    
    //Optimal Solution 


    //Reverse the element : 
    public static void Reverse(int[] arr, int start, int end ){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Rotate 
    public static void Rotateleftorright(int[] arr, int n, int k){
        // Reverse first n-k element
        Reverse(arr, 0, n-k-1);
        //Reverse last k element
        Reverse(arr, n-k, n-1);
        //Reverse whole element
        Reverse(arr, 0, n-1);
    }
   
    

/*
    //Brute Force
    
    
    static void rotatebyk(int [] arr, int k ){

        int n = arr.length;
        int [] temp = new int[k];
        
        // copy first k element into temp
        
        for(int i = 0; i<k;i++){
            temp[i] = arr[i];
        }
        
        // shifting first k element 
        for (int i = 0; i <n-k; i++) {
            arr[i] = arr[i+k];

        }
        
        //Putting the temp element in the end 
        for(int i = n-k ; i<n; i++){
            arr[i] = temp[i-(n-k)];
        }
        
    }
    


*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array element from user
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" number elements in array :");
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Rotate by (k) element : ");
        int k = sc.nextInt();

        System.out.println("");

        

        Rotateleftorright(arr, n, k);
        // rotatebyk(arr, k);

        System.out.println("");



        System.out.print("Array after rotating : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

