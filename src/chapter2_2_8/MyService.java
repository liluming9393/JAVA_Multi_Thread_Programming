package chapter2_2_8;

public class MyService {
    private String lock="123";
    public void testMethod(){
        try{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
                Thread.sleep(10);
                lock="456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
