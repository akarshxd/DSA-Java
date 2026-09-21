
import java.util.Scanner;

/*
 * check if we can partition the array into two subarrays with equal sum, more formally check that the prefix sum of a part of that array is equal to the suffix sum of rest of the array ~ 
 */
 public class EqualSumPartition{
    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            totalSum +=arr[idx];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int [] arr){
        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for (int idx = 0; idx < arr.length-1; idx++) {
            prefixSum += arr[idx];
            int suffixSum = totalSum - prefixSum ;
            if(prefixSum == suffixSum){
                return true;
            }           
        } 
        
        return false;
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
        System.out.println("Equal partition is possible : "+equalSumPartition(arr));
    }
 }