package chapter3_1_10;

public class test {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            a.start();
            ThreadB b=new ThreadB(lock);
            b.start();
            ThreadC c=new ThreadC(lock);
            c.start();
            Thread.sleep(1000);
            NotifyThread notifyThread=new NotifyThread(lock);
            notifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
