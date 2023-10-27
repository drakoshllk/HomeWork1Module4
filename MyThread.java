public class MyThread extends Thread {
    Counter counter = new Counter();
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        System.out.println(counter.getValue());
    }
    public void threadStart() throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.join();
    }
}