package chapter2_2_5;

public class Service {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        while(true){

        }
//        System.out.println("methodB end");
    }
    synchronized public void methodB(){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
