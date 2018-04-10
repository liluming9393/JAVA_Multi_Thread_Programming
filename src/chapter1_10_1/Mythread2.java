package chapter1_10_1;

public class Mythread2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Mythread2 priority: "+this.getPriority());
    }
}
