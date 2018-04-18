package chapter2_3_2;

public class test {
    public static void main(String[] args) {
        Mythread[] mythread=new Mythread[100];
        for(int i=0;i<100;i++){
            mythread[i]=new Mythread();
        }
        for(int i=0;i<100;i++){
            mythread[i].start();
        }
    }
}
