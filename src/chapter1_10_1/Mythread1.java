package chapter1_10_1;

public class Mythread1 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Mythread1 priority: "+this.getPriority());
        Mythread2 mythread2=new Mythread2();
        mythread2.start();
    }
}
