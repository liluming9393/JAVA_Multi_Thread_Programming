package chapter1_4_1;

public class Mythread extends Thread {
    public Mythread(){
        System.out.println("Mythread start");
        System.out.println("Thread.currentThread().getName() "+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() "+Thread.currentThread().isAlive());
        System.out.println("this.getName() "+this.getName());
        System.out.println("this.isAlive() "+this.isAlive());
        System.out.println("Mythread end");
    }
    @Override
    public void run() {
        super.run();
        System.out.println("run start");
        System.out.println("Thread.currentThread().getName() "+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() "+Thread.currentThread().isAlive());
        System.out.println("this.getName() "+this.getName());
        System.out.println("this.isAlive() "+this.isAlive());
        System.out.println("run end");
    }
}
