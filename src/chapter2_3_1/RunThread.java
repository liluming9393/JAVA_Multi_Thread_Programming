package chapter2_3_1;

public class RunThread extends Thread {
    private boolean isrunning = true;

    public boolean isIsrunning() {
        return isrunning;
    }

    public void setIsrunning(boolean isrunning) {
        this.isrunning = isrunning;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("start");
        while(isrunning==true){

        }
        System.out.println("stop");
    }
}
