package chapter1_7_3;

public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<500000;i++){
            if(this.interrupted()){
                break;
            }
            System.out.println("i = "+i);
        }
        System.out.println("some thing after loop");
    }
}
