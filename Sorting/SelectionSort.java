
import java.util.Scanner;

/*
Selection Sort is a simple sorting algorithm that sorts an array by repeatedly finding the smallest element from the unsorted part of the array and placing it at the beginning of that part.

It continues this process until the entire array is sorted in ascending order.


Algorithm (Ascending Order)

1. Start from the first element of the array.

2. Assume the current element is the smallest.

3. Compare it with all the remaining elements and find the smallest element.

4. Swap the smallest element with the current element.

5. Move to the next position and repeat the process.

6. Stop when the array is sorted.
*/

class SelectionSort{

    static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }

    static void selection(int [] arr){
        
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
        selection(arr);
        print(arr);
    }
}