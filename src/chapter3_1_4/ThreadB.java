package chapter3_1_4;

public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try{
            synchronized (lock){
                for(int i=0;i<10;i++){
                    Mylist.add();
                    if(Mylist.size()==5){
                        lock.notify();
                        System.out.println("send notify");
                    }
                    System.out.println("add "+(i+1)+" elements");
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
