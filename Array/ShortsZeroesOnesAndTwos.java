public class ShortsZeroesOnesAndTwos{

    static void shortszeroesonesNtwos(int[]arr){
        int n = arr.length;
        int zeroes =0;
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0 -> zeroes++;
                case 1 -> ones++;
                case 2 -> twos++;
                default -> {
                }
            }
        }

        for(int i = 0; i<zeroes; i++){
            arr[i]=0;
        }
        for(int i = zeroes; i<zeroes+ones ; i++){
            arr[i]=1;
        }
        for(int i = zeroes+ones; i<arr.length; i++){
            arr[i] = 2;
        }


    }

    static void print(int[]arr){
        for(int ele: arr){
            System.out.print(ele+" ");

        }
        System.out.println("");
    }
    public static void main(String[] args) {
       int[]arr ={0,1,2,0,1,1,1,2,0,0,0,2};
        print(arr);
        shortszeroesonesNtwos(arr);
        print(arr);
        
    }
}