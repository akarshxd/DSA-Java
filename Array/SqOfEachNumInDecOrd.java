/*
 * Given an integer array sorted in non decreasing order, return an array of the square of each number sorted in  non decreasing order.
 */

import java.util.*;

public class SqOfEachNumInDecOrd{
    static void reverse(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            swap(arr, i, n-i-1);
        }
    }
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr [j];
        arr[j] = temp;
    }
    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    static int[] sortArray(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int [] ans = new int [n];
        int k = 0;
        while(left<= right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            }else{
                ans[k++]= arr[right]*arr[right];
                right --;
            }
        }
        reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of Array : ");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array : ");
        printArray(arr);
        int[] sortedSquares = sortArray(arr);  // ✅ capture the returned array

        System.out.println("Squared Array in Descending Order:");
        printArray(sortedSquares);             // ✅ print the correct result
    }


}