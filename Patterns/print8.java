
import java.util.Scanner;

public class print8{
    public static void print(int r){
        for(int i = 1; i<=r; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number : ");
        int r = sc.nextInt();
        print(r);
    }
}