package chapter1_3_1;

public class Mythread extends Thread {
    public Mythread(){
        System.out.println("构造函数 "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run "+Thread.currentThread().getName());
    }
}
