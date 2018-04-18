package chapter2_2_8;

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.testMethod();
    }
}
