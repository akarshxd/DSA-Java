
import java.util.Scanner;

/* 
Bubble Sort is a sorting algorithm that repeatedly compares two adjacent elements and swaps them if they are in the wrong order.

Case	Time
Best*	O(n)
Average	O(n²)
Worst	O(n²)
Space	O(1)

*/
public class BubbleSort{
    static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }
    
    static void bubble(int[]arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++ ){ // number of pass\
                boolean isSorted = true;
            for(int j = 0 ; j<n-1-i; j++){ // swap with adjacent element 
                if(arr[j]>arr[j+1]){
                    // swap(arr);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false; // agar swap hua mtlb array sorted nhi tha 
                }
            }
            if(isSorted == true) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the array : ");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
            
        }
        print(arr);
        bubble(arr);
        print(arr);
    }
}