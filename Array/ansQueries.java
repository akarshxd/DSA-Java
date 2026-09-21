import java.util.*;

public class ansQueries{
    
    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    static int [] makePrefixSum(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n ; i++){
            arr[i]+=arr[i-1];
        }
        return arr;
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

        int [] prefSum = makePrefixSum(arr);
        System.out.println("Enter number of Queries : ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter range ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l-1];
            System.out.println(ans);

        }
    }
}