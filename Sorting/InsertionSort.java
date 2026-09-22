
import java.util.Scanner;

/*
Insertion Sort is a sorting algorithm that sorts an array by taking one element at a time and inserting it into its correct position in the already sorted part of the array.

It works like arranging playing cards in your hand. You pick one card and insert it in the correct position among the cards you have already sorted.

Algo : There are two parts of array sorted and unsorted one, unsorted part ka pahla element sorted element me correct place pe insert krna h 

Time Complexity

Best case O(n)
Average case O(n²)
Worst case O(n²)

Space Complexity: O(1)

Stable: Yes

In-place: Yes

*/

public class InsertionSort{
    static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }
    
    static void Insertion(int[]arr){
        
        for(int i = 0; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                // swap(arr[j], arr[j-1])
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = temp;
                j--;
            }
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
        Insertion(arr);
        print(arr);
    }
}
