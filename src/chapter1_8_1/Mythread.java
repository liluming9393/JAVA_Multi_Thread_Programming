package chapter1_8_1;

public class Mythread extends Thread {
    private long i=0;
    public long getI(){
        return this.i;
    }
    public void setI(long i){
        this.i=i;
    }
    @Override
    public void run() {
        super.run();
        while(true){
            i++;
        }
    }
}
