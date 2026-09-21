import java.util.*;
public class RotatebyOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+"number elements in array :");
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("");
        int temp = arr[0];
        System.out.print("After doing left Rotation by One : ");
        for(int i = 0; i<n-1; i++){
            arr[i]= arr[i+1];
        }
        arr[n-1] = temp;
        System.out.print("After doing left Rotation by One: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}