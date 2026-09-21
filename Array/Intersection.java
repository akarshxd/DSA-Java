import java.util.*;

public class Intersection{
    public static int [] intersection(int[] arr1, int [] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int [] visited = new int[m]; // to keep track of visited element in arr2
        int [] temp = new int[Math.min(n, m)]; // To store maximum possible size after intersection
        int index = 0; // To keep track of visisted element in temp

        // Loop for arr1
        for(int i = 0; i<n ; i++){
            // inner loop goes throgh every element of arr2 for each arr[i];
            for(int j = 0; j<m; j++){
                // check element is common in both array or not and arr2[j] has not been used by visited[]==0

                if(arr1[i]==arr2[j]&&visited[j]==0){
                    temp[index]=arr1[i];
                    index++;
                    visited[j] =1; // marking arr2[j] is used so it is not used again
                    break;// break the loop when we found our match

                }
                if(arr2[j]>arr1[i]){
                    break; 
                    //in sorted array If arr2[j] is already greater than arr1[i], there’s no chance of matching arr1[i] with any later arr2[j].
                }

                // Create the final answer on the basis of how much elements we found and we were tracking number of element by index so we'll create size of our final answer array of the size of index
                
                
                
            }
        }
        int [] ans = new int[index];
        //store the element
        for(int k = 0; k<index; k++){
            ans[k]= temp[k]; //Copies elements from temp to ans — so that unused space in temp is not part of the final result.
        }
            return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           // Take 1St Array 
 
           System.out.print("Enter the length of first Array : ");
           int n = sc.nextInt();
   
           System.out.println("");
   
           int [] arr1  = new int [n];
           System.out.print("1st Array : ");
           for(int i = 0; i<n ; i++){
               arr1[i] = sc.nextInt();
           }
   
           System.out.print("1st Array : ");
           for(int i =0; i<n; i++){
               System.out.print(" "+arr1[i]);
           }
   
           System.out.println("");
   
           //Take 2nd Array 
   
           System.out.print("Enter the length of Second Array : ");
           int m = sc.nextInt();
   
           System.out.println("");
   
           int [] arr2  = new int [m];
           System.out.print("2nd Array : ");
           for(int i = 0; i<m ; i++){
               arr2[i] = sc.nextInt();
           }
   
           System.out.print("2nd Array : ");
           for(int i =0; i<m; i++){
               System.out.print(" "+arr2[i]);
           }
   
           //Sort the both array first before taking union
   
           Arrays.sort(arr1);
           Arrays.sort(arr2);
   
           int[] result = intersection(arr1, arr2);
         System.out.print("\nIntersection: ");
         for (int val : result) {
             System.out.print(val + " ");
         }
 
 
     }
 
 }