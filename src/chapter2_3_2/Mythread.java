package chapter2_3_2;

public class Mythread extends Thread {
//    volatile public static int count=0;
//    private static void addcount(){
//        for(int i=0;i<100;i++){
//            count++;
//        }
//        System.out.println("count = "+count);
//    }
    public static int count=0;
    synchronized private static void addcount(){
        for(int i=0;i<100;i++){
            count++;
        }
        System.out.println("count = "+count);
    }

    @Override
    public void run() {
        super.run();
        addcount();
    }
}
