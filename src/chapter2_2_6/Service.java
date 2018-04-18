package chapter2_2_6;

public class Service {
    Object object1=new Object();
    public void methodA(){
        synchronized (object1){
            System.out.println("methodA begin");
            while(true){

            }
        }
    }
    Object object2=new Object();
    public void methodB(){
        synchronized (object2){
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
