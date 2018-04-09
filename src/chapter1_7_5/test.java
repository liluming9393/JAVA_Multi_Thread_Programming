package chapter1_7_5;

public class test {
    public static void main(String[] args) {
        try{
            SychronizedObject sychronizedObject=new SychronizedObject();
            Mythread mythread=new Mythread(sychronizedObject);
            mythread.start();
            Thread.sleep(500);
            mythread.stop();
            System.out.println(sychronizedObject.getUsername()+" "+sychronizedObject.getPassword());
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
