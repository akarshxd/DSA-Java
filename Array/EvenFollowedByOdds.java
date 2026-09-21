
import java.util.Scanner;

//Given an array of integers a, move all the even integers to the beginning of the array followed by all the odd integers. The relative order of the odd or even integers does not matter. Return any array that satisfies the condition.

public class EvenFollowedByOdds{
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }


    static void evenfollowedbyodds(int[] arr){
        int n = arr.length; // length of array
        int left = 0; int right = n - 1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2 ==0){
                swap(arr, left, right);
                left ++;
                right --;
            }
        
            if(arr[left] % 2 == 0){
                left ++;
            }
            if(arr[right] % 2 == 1){
                right --;
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of array : ");
       int n = sc.nextInt();
       int [] arr = new int[n];

       for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("");

        System.out.println("Array :");
        printArray(arr);

        evenfollowedbyodds(arr);
        printArray(arr);
    }
}