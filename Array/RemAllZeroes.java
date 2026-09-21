import java.util.*;
public class RemAllZeroes{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("");
        System.out.println("Remove all zeroes : ");
        int j = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j!=-1){

            for(int i = j+1; i<n; i++){
                if(arr[i]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
        for(int k = 0; k<n; k++){
            System.out.print(arr[k]+" ");
        }

    }
}