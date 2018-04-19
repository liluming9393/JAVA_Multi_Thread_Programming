package chapter3_1_7;

public class synNotifyMethodThread extends Thread {
    private Object lock;

    public synNotifyMethodThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.synNofigyMethod(lock);
    }
}
