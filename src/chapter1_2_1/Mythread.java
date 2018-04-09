package chapter1_2_1;

public class Mythread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("my thread");
    }
}
