package chapter3_1_10;

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("Thread name "+Thread.currentThread().getName()+" begin wait");
                lock.wait();
                System.out.println("Thread name "+Thread.currentThread().getName()+" end wait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
