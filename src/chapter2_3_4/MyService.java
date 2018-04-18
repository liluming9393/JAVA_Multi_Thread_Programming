package chapter2_3_4;

import java.util.concurrent.atomic.AtomicInteger;

public class MyService {
    public static AtomicInteger count = new AtomicInteger(0);
    synchronized public void addnum(){
        System.out.println(Thread.currentThread().getName()+" "+count.addAndGet(100));
        count.incrementAndGet();
    }
}
