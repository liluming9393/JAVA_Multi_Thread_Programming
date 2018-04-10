package chapter1_9_1;

public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        long begintime=System.currentTimeMillis();
        int count=0;
        for(int i=0;i<500000;i++){
            Thread.yield();
            count=i+1;
        }
        long endtime=System.currentTimeMillis();
        System.out.println("use time: "+(endtime-begintime));
    }
}
