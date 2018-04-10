package chapter1_8_1;

public class test {
    public static void main(String[] args) {
        try {
            Mythread mythread=new Mythread();
            mythread.start();
            Thread.sleep(5000);
            mythread.suspend();
            System.out.println("A "+System.currentTimeMillis()+" i "+mythread.getI());
            Thread.sleep(5000);
            System.out.println("A "+System.currentTimeMillis()+" i "+mythread.getI());
            mythread.resume();
            Thread.sleep(5000);
            mythread.suspend();
            System.out.println("B "+System.currentTimeMillis()+" i "+mythread.getI());
            Thread.sleep(5000);
            System.out.println("B "+System.currentTimeMillis()+" i "+mythread.getI());
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
