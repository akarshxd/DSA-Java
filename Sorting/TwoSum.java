import java.util.Arrays;
import java.util.Scanner;

public class TwoSum{
    public static void print(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    static boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        // code here
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target) return true;
            else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
        }
        return false;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int n =sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        print(arr);

        System.out.print("Target Element : ");
        int target = sc.nextInt();
        if(twoSum(arr, target)==true){
            System.out.print("Target Exist");
        }else{
           System.out.print("Target does not Exist");

        }
        
    }
}