
import java.util.ArrayList;
import java.util.Collections;

class basic{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        //print method 1 
        System.out.print(arr);
        System.out.println("");
        //method 2 
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("");
        //method 3
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println("");

        // to get any particular value
        System.out.print(arr.get(3));
        System.out.println("");

        //update value at any particular index

        arr.set(3, 112);
        System.out.print(arr);
        System.out.println("");

        //Add value at end 
        arr.add(234);
        System.out.print(arr);
        System.out.println("");

        //remove value at any index
        arr.remove(4);
        System.out.print(arr);
        System.out.println("");
        

        //Reverse

        Collections.reverse(arr);
        System.out.print(arr);
        System.out.println("");

        //or,

        int start = 0, end = arr.size()-1;
        while(start<=end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
        System.out.print(arr);
        



    }
}