package chapter2_1_7;

public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        Service service=new Service();
        service.service1();
    }
}
