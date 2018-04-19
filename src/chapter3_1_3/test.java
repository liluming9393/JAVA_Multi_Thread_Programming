package chapter3_1_3;

public class test {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            Mythread1 mythread1 = new Mythread1(lock);
            mythread1.start();
            Thread.sleep(3000);
            Mythread2 mythread2 = new Mythread2(lock);
            mythread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
