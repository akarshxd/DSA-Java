import java.util.Scanner;
public class SecondLargest{
    public static int SecondLargest(int [] arr){
        int largest = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int second_largest = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>second_largest && arr[i]!= largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array :");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the "+n+" number of items in array - ");
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Second Largest : "+SecondLargest(arr));
    }
}

//Time Complexity = O(n)