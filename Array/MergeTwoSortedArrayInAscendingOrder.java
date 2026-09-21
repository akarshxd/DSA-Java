
import java.util.Scanner;

class MergeTwoSortedArrayInAscendingOrder{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Array 
        System.out.print("Enter length of First Array :");
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        System.out.print("Enter FIrst Sorted Array : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.print("FIrst Array : ");
        print(arr1);

        // Second Array

        System.out.print("Enter length of Second Array :");
        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        System.out.print("Enter Second Sorted Array : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        System.out.print("Second Array : ");
        print(arr2);

        int [] ans = new int [arr1.length + arr2.length];


        merge(ans, arr1,arr2);
        System.out.println("Merged Array :");
        print(ans);
    }

   

    private static void print(int [] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }

    private static void merge(int [] ans, int[] arr1, int[] arr2) {
        
        int i = 0, j = 0, k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k++] = arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                ans[k++] = arr2[j++];
            }
        }
        if(i == arr1.length)
            while(j<arr2.length){
                ans[k++] = arr2[j++];
                }
        else if(j == arr2.length){
            while(i<arr1.length){
                ans[k++] = arr1[i++];
            }
        }
        
    }
}