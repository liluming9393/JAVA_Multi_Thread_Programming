package chapter2_3_5;

public class MyService {
    private boolean isrunning=true;
    public void runMethod(){
        String anything=new String();
        while(isrunning==true){
//            synchronized (anything){
//
//            }
        }
        System.out.println("stopped");
    }
    public void stopMethod(){
        isrunning=false;
    }
}
