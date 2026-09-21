
import java.util.Collections;
import java.util.Vector;

class AddByOne{
    static Vector<Integer>addOne (int []arr){
        Vector<Integer>ans = new Vector<>();
        int n = arr.length;
        int carry = 1; 
        for(int i = n-1; i>=0 ; i--){
            if(arr[i]+carry <=9){
                ans.add(arr[i]+carry);
                carry =0;
            }
            else if(arr[i]+carry == 10){
                ans.add(0);
                carry = 1; 
            }
        }
        if(carry==1)ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};

        Vector<Integer> result = addOne(arr);

        System.out.println(result);
        

    }
}