package chapter1_5_1;

public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("Thread.currentThread().getName() "+Thread.currentThread().getName()+" begin time"+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("Thread.currentThread().getName() "+Thread.currentThread().getName()+" end time"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
