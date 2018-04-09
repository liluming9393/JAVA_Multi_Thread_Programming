package chapter1_3_2;

public class test {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        Thread thread=new Thread(mythread);
        thread.setName("A");
        thread.start();
//        thread.run();
    }
}
