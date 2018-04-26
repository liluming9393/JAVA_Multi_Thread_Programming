package chapter3_1_8;

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait");
                lock.wait();
                System.out.println("end wait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("wait状态下被interrupt");
        }
    }
}
