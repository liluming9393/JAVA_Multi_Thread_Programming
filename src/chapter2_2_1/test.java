package chapter2_2_1;

public class test {
    public static void main(String[] args) {
        Task task=new Task();
        Mythread1 mythread1=new Mythread1(task);
        mythread1.start();;
        Mythread2 mythread2=new Mythread2(task);
        mythread2.start();
    }
}
