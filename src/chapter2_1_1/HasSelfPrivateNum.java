package chapter2_1_1;

public class HasSelfPrivateNum {
    public void addI(String username){
        try{
            int num=0;
            if(username.equals("a")){
                num=100;
                System.out.println("username a set");
                Thread.sleep(2000);
            }
            else if(username.equals("b")){
                num=200;
                System.out.println("username b set");
            }
            System.out.println(username+" "+num);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
