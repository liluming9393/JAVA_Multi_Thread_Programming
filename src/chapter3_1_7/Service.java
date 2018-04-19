package chapter3_1_7;

public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait "+Thread.currentThread().getName()+" : "+System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait "+Thread.currentThread().getName()+" : "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void synNofigyMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin notify "+Thread.currentThread().getName()+" : "+System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("end notify "+Thread.currentThread().getName()+" : "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
