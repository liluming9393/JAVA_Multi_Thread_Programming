package chapter1_10_2;

public class test {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Mythread1 mythread1=new Mythread1();
            mythread1.setPriority(1);
            mythread1.start();
            Mythread2 mythread2=new Mythread2();
            mythread2.setPriority(10);
            mythread2.start();
        }
    }
}
