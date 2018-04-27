package chapter3_1_14;

public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }
    public void add(){
        synchronized (lock){
            ValueObject.list.add("anything");
            lock.notifyAll();
        }
    }
}
