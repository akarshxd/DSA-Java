
import java.util.Scanner;

public class palindrom{

    public static int reverse(int n){
        int revN = 0;
        while(n>0){

            int lastDigit = n%10;
            n = n/10;
            revN = (revN*10)+lastDigit;
        }
        return revN;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        if(num == reverse(num)){
            System.out.println("number is palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}