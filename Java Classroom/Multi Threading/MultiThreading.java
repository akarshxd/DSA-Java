class A extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

public class MultiThreading{
    public static void main(String[] args){

        A t1 = new A();
        t1.start(); // Starts method use to execute the thread 'run'  method.

    }
}

