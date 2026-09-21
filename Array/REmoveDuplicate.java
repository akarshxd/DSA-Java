
import java.util.*;


public class REmoveDuplicate extends CheckSorted{

    //Remove Duplicate
    public static int remduplicate(int[] arr){
        int k = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=arr[k]){
                arr[k+1]= arr[i];
                k++;
            }
        }
        return k+1;
    }


    
    public static void main(String[] args) {
        // Using Inheritance , by using parent class CheckSorted
        CheckSorted cs = new CheckSorted();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+"number elements in array :");
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        if(cs.isSorted(arr)){

            int unique_len = remduplicate(arr);
            // If array is sorted then it will remove the duplicates and give the number of exact element in array after removing duplicates.
            System.out.println("Number of Unique Element: "+unique_len);
            System.out.print("Array after Removing Element : ");
            for(int i = 0; i<unique_len; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Not Sorted, First Enter Sorted Element.");
        }

    }
}