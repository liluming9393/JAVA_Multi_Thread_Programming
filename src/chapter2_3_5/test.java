package chapter2_3_5;

public class test {
    public static void main(String[] args) {
        try{
            MyService myService=new MyService();
            ThreadA threadA=new ThreadA(myService);
            threadA.start();
            Thread.sleep(1000);
            ThreadB threadB=new ThreadB(myService);
            threadB.start();
            System.out.println("send stop message");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
