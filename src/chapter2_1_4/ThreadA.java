package chapter2_1_4;

public class ThreadA extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("a");
    }
}
