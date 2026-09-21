/*
 *
 **
 ***
 ****
 *****
 */
import java.util.Scanner;
public class print2{
    public static void print(int x){
        for(int i=0; i<x; i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*");
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