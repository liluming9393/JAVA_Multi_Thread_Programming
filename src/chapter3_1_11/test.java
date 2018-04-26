package chapter3_1_11;
public class test {
    public static void main(String[] args) {
        Thread t=new Thread(MyRunnable.runnable1);
        t.start();
    }
}
