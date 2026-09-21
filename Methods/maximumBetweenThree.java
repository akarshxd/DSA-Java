
import java.util.Scanner;

public class maximumBetweenThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.print(Math.max(x, Math.max(y, z)));
        System.out.print(Math.min(x, Math.min(y, z)));
    }
}