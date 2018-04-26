package chapter3_1_12;

public class test {
    public static void main(String[] args) {
        try {
            MyRun myRun=new MyRun();
            Thread b=new Thread(myRun.runnable2);
            b.start();
            Thread.sleep(100);
            Thread a=new Thread(myRun.runnable1);
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
