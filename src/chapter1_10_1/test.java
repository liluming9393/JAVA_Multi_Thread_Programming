package chapter1_10_1;

public class test {
    public static void main(String[] args) {
        System.out.println("main priority： "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main priority： "+Thread.currentThread().getPriority());
        Mythread1 mythread1=new Mythread1();
        mythread1.start();
    }
}
