package chapter1_7_2;

public class test {
    public static void main(String[] args) {
        try {
            Mythread mythread=new Mythread();
            mythread.start();
            Thread.sleep(2000);
//            mythread.interrupt();
            Thread.currentThread().interrupt();
            System.out.println("是否停止1："+mythread.interrupted());
            System.out.println("是否停止2："+mythread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
