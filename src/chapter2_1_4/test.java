package chapter2_1_4;

public class test {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum1=new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum2=new HasSelfPrivateNum();
        ThreadA threadA=new ThreadA(hasSelfPrivateNum1);
        threadA.start();
        ThreadB threadB=new ThreadB(hasSelfPrivateNum2);
        threadB.start();
    }
}
