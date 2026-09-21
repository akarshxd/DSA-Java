import java.util.Scanner;
public class print10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print((char)(j+64)+" "); //for Capital letter
                System.out.print((char)(j+96)+" "); //for Small letter
                
            }
            System.out.println("");
        }
    }
}