package chapter1_4_1;

public class test {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();
        System.out.println("main Thread.currentThread().isAlive() "+Thread.currentThread().isAlive());
    }
}
