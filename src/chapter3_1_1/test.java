package chapter3_1_1;

public class test {
    public static void main(String[] args) {
        try{
            String newstring = new String("");
            newstring.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
