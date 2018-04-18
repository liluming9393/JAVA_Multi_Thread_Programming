package chapter2_3_5;

public class ThreadB extends Thread {
    MyService myService=new MyService();

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.stopMethod();
    }
}
