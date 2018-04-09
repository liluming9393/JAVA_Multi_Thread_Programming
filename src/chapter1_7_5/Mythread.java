package chapter1_7_5;

public class Mythread extends Thread{
    private SychronizedObject sychronizedObject;
    public Mythread(SychronizedObject sychronizedObject){
        this.sychronizedObject=sychronizedObject;
    }
    @Override
    public void run() {
        super.run();
        sychronizedObject.printString("b","bb");
    }
}
