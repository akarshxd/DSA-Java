import java.util.Scanner;
public class MissingInArray {
    public static int missingNum(int [] arr) {
        long n = arr.length + 1;
        long sum = n*(n+1)/2;
        long arrSum = 0;
        for(int ele : arr){
            arrSum += ele;
        }
        return (int)(sum - arrSum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking array element from user
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" number elements in array :");
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        //print 
        for(int ele: arr){
            System.out.print(ele+" ");
        }

        int missingNumber = missingNum(arr);
        System.out.print("Missing Number is : "+missingNumber);
        

    }
}