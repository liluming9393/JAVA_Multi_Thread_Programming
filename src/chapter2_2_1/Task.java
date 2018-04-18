package chapter2_2_1;

public class Task {
    public void doLongTimeTask(){
        for(int i=0;i<20;i++){
            System.out.println("nosynchronized threadName = "+Thread.currentThread().getName()+" i = "+i);
        }
        System.out.println("");
        synchronized (this){
            for(int i=0;i<20;i++){
                System.out.println("synchronized threadName = "+Thread.currentThread().getName()+" i = "+i);
            }
        }
    }
}
