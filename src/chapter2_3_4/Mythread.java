package chapter2_3_4;

public class Mythread extends Thread {
    MyService myService=new MyService();

    public Mythread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.addnum();
    }
}
