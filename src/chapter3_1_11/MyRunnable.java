package chapter3_1_11;

public class MyRunnable {
    static private Object lock=new Object();
    static public Runnable runnable1=new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    System.out.println("begin wait time "+System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("end wait time "+System.currentTimeMillis());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };
}
