package chapter1_2_2;

public class test {
    public static void main(String[] args) {
        Mythread mythread1=new Mythread(1);
        Mythread mythread2=new Mythread(2);
        Mythread mythread3=new Mythread(3);
        Mythread mythread4=new Mythread(4);
        Mythread mythread5=new Mythread(5);
        mythread1.start();
        mythread2.start();
        mythread3.start();
        mythread4.start();
        mythread5.start();
    }
}
