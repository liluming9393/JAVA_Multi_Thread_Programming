package chapter2_1_5;

public class MyObject {
    synchronized public void MethodA(){
        try{
            System.out.println("MethodA: "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("MethodA: "+System.currentTimeMillis());
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void MethodB(){
        try{
            System.out.println("MethodB: "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("MethodB: "+System.currentTimeMillis());
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
