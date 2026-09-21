// Number of pairs whose sum is equal to given x

import java.util.Scanner;

public class TargetSum{
    public static int targetsum(int[] arr, int x){
        int n = arr.length;
        int ansCount = 0;
        for(int i = 0; i<n ; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+ arr[j]==x){
                    ansCount++;
                }
            }
        }
        return ansCount;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum TArget :");
        int x = sc.nextInt();

        System.out.println("no of pairs = "+targetsum(arr, x));


    }
}