package chapter1_7_1;

public class test {
    public static void main(String[] args) {
        try {
            Mythread mythread=new Mythread();
            mythread.start();
            Thread.sleep(1000);
            mythread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
