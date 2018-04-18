package chapter2_2_1;

public class Mythread1 extends Thread {
    private Task task;

    public Mythread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
