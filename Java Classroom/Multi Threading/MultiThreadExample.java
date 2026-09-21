class Task1Thread extends Thread {
    public void run() {
        System.out.println("Task 1");
    }
}

class Task2Thread extends Thread {
    public void run() {
        System.out.println("Task 2");
    }
}

public class MultiThreadExample{
    public static void main(String[] args) {
        Task1Thread t = new Task1Thread();
        Task2Thread tt = new Task2Thread();
        t.start();
        tt.start();
    }
}
