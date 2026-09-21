
import java.util.Scanner;

public class CheckSortedArray{
    static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele+" ");

        }
        System.out.println("");
    }

    static boolean sortArray(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
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
        System.out.print(sortArray(arr));
    
    }
}