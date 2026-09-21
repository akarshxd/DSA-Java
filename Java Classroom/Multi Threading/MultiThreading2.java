class T extends Thread{
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println("Task 1 - count : "+i);

        }
    }
}

class T2 extends Thread{
    public void run(){
        for(int i = 0; i<5 ; i++){
            System.out.println("Task 2 - count :"+i);
        }
    }
}

public class MultiThreading2{
    public static void main(String[] args){
        T t1 = new T();
        T2 t2 = new T2();
        T2 t3 = new T2();

        // Start method can be call only once but can be called run method multiple time and could me multiple thread and start method would get called only one time in each thread but run method can be called many times.

        t1.start();
        t2.start();
        t3.start();
    }
}