package chapter1_10_2;

import java.util.Random;

public class Mythread1 extends Thread {
    @Override
    public void run() {
        super.run();
        long begintime=System.currentTimeMillis();
        long res=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<50000;j++){
                Random random=new Random();
                random.nextInt();
                res+=j;
            }
        }
        long endtime=System.currentTimeMillis();
        System.out.println("Mythread1:"+(endtime-begintime));
    }
}
