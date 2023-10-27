public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.threadStart();
        myThread.threadStart();
    }
}