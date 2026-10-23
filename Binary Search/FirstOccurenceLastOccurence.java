
import java.util.ArrayList;
import java.util.Scanner;

public class FirstOccurenceLastOccurence{
    static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    static ArrayList<Integer> firstandlastOccur(int[]arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int low = 0, high = n-1, idx = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]<target) low = mid +1;
            else if(arr[mid]>target) high = mid -1;
            else {
                idx = mid;
                high = mid -1;
                }
        }
        ans.add(idx);
        low = 0;
        high = n-1; 
        idx = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]<target) low = mid +1;
            else if(arr[mid]>target) high = mid -1;
            else {
                idx = mid;
                low = mid+1;
                }
        }
        ans.add(idx);
        return ans;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element of this Array : ");
        for (int idx = 0; idx <arr.length ; idx++) {
            arr[idx] = sc.nextInt();
        }
        print(arr);
        System.out.print("target : ");
        int target = sc.nextInt();
        ArrayList<Integer>result =firstandlastOccur(arr, target);
        System.out.print(result);
    }
}