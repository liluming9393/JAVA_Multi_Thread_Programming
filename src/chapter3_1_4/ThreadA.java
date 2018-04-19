package chapter3_1_4;

public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try{
            synchronized (lock){
                if(Mylist.size()!=5){
                    System.out.println("wait begin time = "+System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end time = "+System.currentTimeMillis());
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
