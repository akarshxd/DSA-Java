import java.util.Scanner;


public class TwoSum{
    public static void print(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
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
        boolean found = false;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    found = true;
                    break;
                
                }
            }
        }

        if(found){
            System.out.print("Target exist. ");
        }else{
            System.out.print("Target does not exist. ");
        }
    }
}