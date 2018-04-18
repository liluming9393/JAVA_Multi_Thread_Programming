package chapter2_3_1;

public class test {
    public static void main(String[] args) {
        try{
            RunThread runThread=new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setIsrunning(false);
            System.out.println("after set false");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
