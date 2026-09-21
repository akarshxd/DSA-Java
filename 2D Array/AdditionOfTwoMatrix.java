import java.util.Scanner;
public class AdditionOfTwoMatrix{
    static void printArray(int[][]arr){
        for(int i= 0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    static void add(int[][]arr1, int r1, int c1, int [][] arr2, int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong Input, Addition not Possible..\n Enter those matrices whose raw and column is equal to each other. ");
            return;
        }
        int [][] sum = new int [r1][c1]; // we can give here any row and column size bcz r1 = r2 and c1 = c2..
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        printArray(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Rrow 'r' and Column 'c' : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr1 = new int[r][c];
        System.out.println("Enter the r*c matrix 1 : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix 1  : ");
        printArray(arr1);
        int [][] arr2 = new int[r][c];
        System.out.println("Enter the r*c matrix 2 : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                arr2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix 2  : ");
        printArray(arr2);
        System.out.println("Sum of Matrix 1 and Matrix 2 : ");
        add(arr1, r, c, arr2, r, c);

    }
}