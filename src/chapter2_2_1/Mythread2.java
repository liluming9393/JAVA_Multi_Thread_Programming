package chapter2_2_1;

public class Mythread2 extends Thread {
    private Task task;

    public Mythread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
