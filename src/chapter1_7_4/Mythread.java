package chapter1_7_4;

public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("ready stop");
                    throw new InterruptedException();
                }
                System.out.println("i = "+i);
            }
            System.out.println("some thing after loop");
        }
        catch (InterruptedException e){
            System.out.println("catch run");
            e.printStackTrace();
        }
    }
}
