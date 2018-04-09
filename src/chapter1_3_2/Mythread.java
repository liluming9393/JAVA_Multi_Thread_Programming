package chapter1_3_2;

public class Mythread extends Thread {
    public Mythread(){
        System.out.println("construct start");
        System.out.println("Thread.currentThread().getName() "+Thread.currentThread().getName());
        System.out.println("this.getName() "+this.getName());
        System.out.println("construct end");
    }
    @Override
    public void run() {
        super.run();
        System.out.println("run start");
        System.out.println("Thread.currentThread().getName() "+Thread.currentThread().getName());
        System.out.println("this.getName() "+this.getName());
        System.out.println("run end");
    }
}
