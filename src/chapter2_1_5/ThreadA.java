package chapter2_1_5;

public class ThreadA extends Thread {
    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.MethodA();
    }
}
