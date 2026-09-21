class A implements Runnable{
    public void run(){
        System.out.println("Thread is running..");

    }
}



public class MultiThreadUsingInterface{
    public static void main(String[] args){
        A runnable = new A();
        Thread t1 = new Thread(runnable);
        t1.start();

    }
}