import java.util.*;
public class print7{
    public static void print(int x){
        for(int i = x; i>=1; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        print(x);
    }
}