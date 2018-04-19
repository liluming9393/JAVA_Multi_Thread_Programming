package chapter3_1_3;

public class Mythread2 extends Thread {
    private Object lock;

    public Mythread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock){
            System.out.println("notify start time = "+System.currentTimeMillis());
            lock.notify();
            System.out.println("notify end start time = "+System.currentTimeMillis());
        }
    }
}
