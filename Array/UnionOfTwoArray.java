//Brute Force Approach
import java.util.*;
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take 1St Array 

//         System.out.print("Enter the length of first Array : ");
//         int n = sc.nextInt();

//         System.out.println("");

//         int [] arr1  = new int [n];
//         System.out.print("1st Array : ");
//         for(int i = 0; i<n ; i++){
//             arr1[i] = sc.nextInt();
//         }

//         System.out.print("1st Array : ");
//         for(int i =0; i<n; i++){
//             System.out.print(" "+arr1[i]);
//         }

//         System.out.println("");

//         // Take 2nd Array 

//         System.out.print("Enter the length of Second Array : ");
//         int m = sc.nextInt();

//         System.out.println("");

//         int [] arr2  = new int [m];
//         System.out.print("2nd Array : ");
//         for(int i = 0; i<m ; i++){
//             arr2[i] = sc.nextInt();
//         }

//         System.out.print("2nd Array : ");
//         for(int i =0; i<m; i++){
//             System.out.print(" "+arr2[i]);
//         }

//         System.out.println("");

//         // Init the Tree Set
//         //Adding element of first array in set1
//         Set<Integer> set1 = new TreeSet<>();
//         for(int i = 0; i<n; i++){
//             set1.add(arr1[i]);
//         }
//         //Adding element of second array in set1
//         Set<Integer> set2 = new TreeSet<>();
//         for(int i = 0; i<m; i++){
//             set2.add(arr2[i]);
//         }

//         //Taking Union 
//         set1.addAll(set2);
//         System.out.print("Union of both array: "+set1);
//     }
// }

//Optimal Approach

public class UnionOfTwoArray{
    public static void Union(int[] a, int[]b){
        int n1 = a.length;
        int n2 = b.length;

        int i =0;
        int j =0;
        int[] unionArr = new int[n1+n2];
        int index=0; // To Track last element of UnionArr

        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(index==0 || unionArr[index-1]!=a[i]){
                    unionArr[index] =a[i];
                    index++;
                }
                i++;
            }
            else if(b[j]<a[i]){
                if(index==0 || unionArr[index-1]!=b[j]){
                    unionArr[index]=b[j];
                    index++;

                }
                j++;
            }
            else if(a[i]==b[j]){
                if(index==0|| unionArr[index-1]!=a[i]){
                    unionArr[index]=a[i];
                    index++;
                }
                i++;
                j++;
            }
        }
        while(i<n1){
            if(index==0 || unionArr[index-1]!=a[i]){
                unionArr[index]=a[i];
                index++;
            }
            i++;
        }
        while(j<n2){
            if(index==0 || unionArr[index-1]!=b[j]){
                unionArr[index]=b[j];
                index++;
            }
            j++;
        }
        System.out.println("\nArray after Union : ");
        for (int k = 0; k < index; k++) {
            System.out.print(" " + unionArr[k]);
        }

            
        
    }
    
    public static void main(String[] args){
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

        Union(arr1, arr2);

    }
}