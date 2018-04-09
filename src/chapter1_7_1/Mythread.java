package chapter1_7_1;

public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<500000;i++){
            System.out.println("i = "+i);
        }
    }
}
