package chapter3_1_13;

public class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        r.subtract();
    }
}
