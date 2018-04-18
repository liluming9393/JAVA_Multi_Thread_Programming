package chapter2_2_2;

public class Service {
    synchronized public static void printA(){
        try {
            System.out.println("thread name: "+Thread.currentThread().getName()+ " time: "+System.currentTimeMillis()+" printA");
            Thread.sleep(3000);
            System.out.println("thread name: "+Thread.currentThread().getName()+ " time: "+System.currentTimeMillis()+" printA");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized public static void printB(){
        System.out.println("thread name: "+Thread.currentThread().getName()+ " time: "+System.currentTimeMillis()+" printB");
        System.out.println("thread name: "+Thread.currentThread().getName()+ " time: "+System.currentTimeMillis()+" printB");
    }
    synchronized public void printC(){
        System.out.println("thread name: "+Thread.currentThread().getName()+ " time: "+System.currentTimeMillis()+" printC");
        System.out.println("thread name: "+Thread.currentThread().getName()+ " time: "+System.currentTimeMillis()+" printC");
    }
}
