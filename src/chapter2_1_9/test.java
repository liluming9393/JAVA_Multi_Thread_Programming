package chapter2_1_9;

public class test {
    public static void main(String[] args) {
        try{
            Service service=new Service();
            ThreadA threadA=new ThreadA(service);
            threadA.setName("a");
            threadA.start();
            Thread.sleep(5);
            ThreadB threadB=new ThreadB(service);
            threadB.setName("b");
            threadB.start();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
