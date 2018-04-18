package chapter2_2_4;
public class Service {
    public static void print(Object o){
        try{
            synchronized (o){
                while(true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
