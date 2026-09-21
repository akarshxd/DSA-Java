public class Swapping{

    // Using temp 
    /* 
    public static void swap(int a, int b){
        System.out.println("value of a before swapping : "+a+" and b : "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a after swapping : "+a+" and b : "+b);
    } */

    // without using temp(using sum and differences)
    public static void swap(int a, int b){
        System.out.println("value of a before swapping : "+a+" and b : "+b);
        a = a + b; // let a = 3, b = 4 then a = a+b => a = 7
        b = a - b; // value of a became 7 and b is still 4 so after doing b = a-b, b will be 7- 4 = 3
        a = a - b; //value of a is still 7 and b is 3 now so after doing a = a-b, a will be 7- 3 = 4 and that's how we did swapping without using temp
        
        System.out.println("value of a after swapping : "+a+" and b : "+b);
    } 


    public static void main(String[] args) {
        swap(3, 4);
    }
}