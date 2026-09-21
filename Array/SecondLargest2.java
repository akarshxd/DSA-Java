
import java.util.Scanner;

public class SecondLargest2{
    public static void print(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static int second_largset(int[]arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }    
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]!= max){
                smax = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("enter the element of array : ");
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();

        }
        print(arr);
        int smax = second_largset(arr);
        System.out.print("Second Largest Element is : "+smax);
    }
}