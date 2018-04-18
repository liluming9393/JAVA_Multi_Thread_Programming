package chapter2_1_9;

public class Service {
    synchronized public void testMethod(){
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("Threadname="+Thread.currentThread().getName()+" run begin time"+System.currentTimeMillis());
            int i=1;
            while(i==1){
                if((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("Threadname="+Thread.currentThread().getName()+" run begin time"+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else{
            System.out.println("Thread B run time="+System.currentTimeMillis());
        }
    }
}
