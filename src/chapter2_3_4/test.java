package chapter2_3_4;

public class test {
    public static void main(String[] args) {
        try{
            MyService myService=new MyService();
            Mythread[] mythreads=new Mythread[5];
            for(int i=0;i<5;i++){
                mythreads[i]=new Mythread(myService);
            }
            for(int i=0;i<5;i++){
                mythreads[i].start();
            }
            Thread.sleep(1000);
            System.out.println(MyService.count.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
