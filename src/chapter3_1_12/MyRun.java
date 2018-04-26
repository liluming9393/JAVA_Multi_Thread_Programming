package chapter3_1_12;

public class MyRun {
    private String lock=new String("");
    public Runnable runnable1=new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock){
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    public Runnable runnable2=new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
            }
        }
    };
}
