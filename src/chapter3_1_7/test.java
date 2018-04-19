package chapter3_1_7;

public class test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        synNotifyMethodThread synNotifyMethodThread = new synNotifyMethodThread(lock);
        synNotifyMethodThread.start();
    }
}
