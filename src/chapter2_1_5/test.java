package chapter2_1_5;

public class test {
    public static void main(String[] args) {
        MyObject myObject=new MyObject();
        ThreadA threadA=new ThreadA(myObject);
        threadA.start();
        ThreadB threadB=new ThreadB(myObject);
        threadB.start();
    }
}
