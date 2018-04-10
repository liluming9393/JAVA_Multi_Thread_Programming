package chapter2_1_8;

public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        Sub sub=new Sub();
        sub.operateISubMethod();
    }
}
