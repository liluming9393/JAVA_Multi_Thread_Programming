package chapter3_1_6;

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait");
                lock.wait();
//                Thread.sleep(10000);
                System.out.println("end wait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
