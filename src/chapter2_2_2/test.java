package chapter2_2_2;

public class test {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadC c=new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
