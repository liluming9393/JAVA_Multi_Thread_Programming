package chapter1_5_1;

public class test {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        System.out.println("main begin time "+System.currentTimeMillis());
//        mythread.start();
        mythread.run();
        System.out.println("main end time "+System.currentTimeMillis());
    }
}
