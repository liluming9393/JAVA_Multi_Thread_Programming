package chapter2_2_8;

public class test {
    public static void main(String[] args) {
        try{
            MyService myService=new MyService();
            ThreadA a=new ThreadA(myService);
            a.setName("A");
            a.start();
            Thread.sleep(50);
            ThreadB b=new ThreadB(myService);
            b.setName("B");
            b.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
