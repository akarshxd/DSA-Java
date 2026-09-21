/*
 ****
 ****
 ****
 ****
 */

import java.util.Scanner;

public class print1{
    public static void print(int x){
        for(int i = 0; i<x ; i++){
            for(int j = 0; j<x; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("x = ");
        int x = sc.nextInt();
        print(x);
    }
}