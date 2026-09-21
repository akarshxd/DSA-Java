/*
Pseudo Code -

fn intersection(a[] b[]){
    in intersection we take only common input

    n = length of array a
    m = length of array b

    Create an temporary array of size min of m and n]

    while i<n and ,j<m
        if a[i] <b[j]
        i++;
        else if a[i]>b[j]
        j++;
        else if a[i]=b[j]
            temp[index++] = a[i]
            i++
            j++
             

        int ans = new int[index]
        for k to index
        ans[k] = temp

        Return ans
}


 */

import java.util.*;
class IntersectionOfTwoArray{

    public static int[] ArrayIntersection(int[] A, int[]B){
        int n = A.length;
        int m = B.length;
        int [] temp = new int[Math.min(n,m)];
        int i =0;
        int j = 0;
        int index = 0;

        while(i<n && j<m){
            if(A[i]<B[j]){
                i++;
            }
            else if(A[i]>B[j]){
                j++;
            }
            else if(A[i]==B[j]){
                temp[index++] = A[i];
                i++;
                j++;
            }
        }
        int [] ans = new int[index];
        for(int k =0; k<index; k++){
            ans[k]= temp[k];
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
  
          int[] result = ArrayIntersection(arr1, arr2);
        System.out.print("\nIntersection: ");
        for (int val : result) {
            System.out.print(val + " ");
        }


    }

}