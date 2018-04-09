package chapter1_2_3;

public class test {
    public static void main(String[] args) {
        Myrunnable myrunnable=new Myrunnable();
        Thread t=new Thread(myrunnable);
        t.start();
        System.out.println("main");
    }
}
