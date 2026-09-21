import java.util.Scanner;
public class print11{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i<=x; i++){
            for(int j = 1; j<=x; j++){
                System.out.print((char)+(i+64)+" ");
            }
            System.out.println();
        }
    }
}
/*  //for small alphabet
import java.util.Scanner;
public class print11{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i<=x; i++){
            for(int j = 1; j<=x; j++){
                System.out.print((char)+(i+96)+" ");
            }
            System.out.println();
        }
    }
} */