package chapter2_1_4;

public class ThreadB extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("b");
    }
}
