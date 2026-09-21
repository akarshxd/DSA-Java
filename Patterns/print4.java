import java.util.Scanner;

public class print4{
    public static void print(int x){
        for(int i =1;i<=x;i++){
            for(int j =1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x = ");
        int x = sc.nextInt();
        print(x);
    }
}