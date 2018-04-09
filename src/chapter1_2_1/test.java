package chapter1_2_1;

public class test {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();
        System.out.println("after run");
    }
}
