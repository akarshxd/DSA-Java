import java.util.*;

public class SortTheArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" number of element in array : ");
        int [] arr= new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        //Sort the array
        Arrays.sort(arr);
        System.out.println("Array after Sorting : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}