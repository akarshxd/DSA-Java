
import java.util.Scanner;

public class Armstrong{

    public static int armstrong(int n){
        int sum = 0;
        while(n>0){

            int lastDigit = n%10;
            sum = sum+((int)Math.pow(lastDigit,3));
            n = n/10;
            
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        if(num == armstrong(num)){
            System.out.println("number is Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}