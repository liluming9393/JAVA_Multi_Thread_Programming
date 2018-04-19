package chapter3_1_2;

public class test {
    public static void main(String[] args) {
        try{
            String lock = new String("");
            System.out.println("syn 上面");
            synchronized (lock){
                System.out.println("syn 第一行");
                lock.wait();
                System.out.println("wait 下面");
            }
            System.out.println("syn 下面");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
