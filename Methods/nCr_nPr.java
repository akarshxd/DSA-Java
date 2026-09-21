
import java.util.Scanner;



public class nCr_nPr{

    public static int fact(int n){
    int f = 1;
    for (int i = 1; i <=n ; i++) {
        f*=i;
    } 
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("r : ");
        int r = sc.nextInt();
        int nCr = fact(n)/(fact(r)*fact(n-r));
        int nPr = fact(n)/fact(n-r);
        System.out.println("nCr : "+nCr);

        System.out.print("nPr : "+nPr);
    }
}