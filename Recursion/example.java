public class example{
    public static int fn(int n){
        if(n==0){
            // System.out.println (sum);
            return 0;
        }
        // sum +=n;
        
        return n+ fn(n-1);
    }
    public static void main(String[] args){
        System.out.println(fn(10));
    }
}

// An never ending Recursion where a function calling itself again and again
