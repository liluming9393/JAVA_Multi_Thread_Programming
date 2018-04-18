package chapter2_2_7;

public class test {
    public static void main(String[] args) {
        try {
            DealThread dealThread=new DealThread();
            dealThread.setFlag("a");
            Thread t1=new Thread(dealThread);
            t1.start();
            Thread.sleep(300);
            dealThread.setFlag("b");
            Thread t2=new Thread(dealThread);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
