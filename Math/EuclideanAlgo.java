
import java.util.Scanner;

public class EuclideanAlgo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2= sc.nextInt();
        while(N1>0&&N2>0){
            if(N1>N2){
                N1 = N1%N2;
            }
            else if(N2>N1){
                N2 = N2%N1;
            }
        }
        if(N1==0){
            System.out.println("Gcd : "+N2);
        }
        else if(N2==0){
            System.out.println("Gcd : "+N1);
        }
    }
}