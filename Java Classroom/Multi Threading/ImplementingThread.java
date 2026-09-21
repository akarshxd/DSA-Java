class A implements Runnable{
    public void run(){
        for(int i = 0; i<=10 ; i++){
            System.out.println("User thread value : "+i);
        }
    }
}

public class ImplementingThread{
    public static void main(String[] args){
        A mt = new A();
        Thread t = new Thread(mt);
        t.start();
    }
}