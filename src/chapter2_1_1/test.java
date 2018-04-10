package chapter2_1_1;

public class test {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum=new HasSelfPrivateNum();
        ThreadA threadA=new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB=new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }
}
