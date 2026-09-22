
import java.util.Scanner;

class KthSmallest{

    public static void print(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static int KthSmallest(int[]arr, int k){
        int n = arr.length;
        for(int i = 0; i<k; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[mindex];
            arr[mindex] = temp;
        }
        return arr[k-1];
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
        System.out.print("value of k : ");
        int k = sc.nextInt();


        print(arr);
        int kthsmallest =KthSmallest(arr, k);
        System.out.print("Kth Smallest Element : "+kthsmallest);

    }
}