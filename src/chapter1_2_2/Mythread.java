package chapter1_2_2;

public class Mythread extends Thread {
    private int i;
    public Mythread(int i){
        super();
        this.i=i;
    }
    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }
}
