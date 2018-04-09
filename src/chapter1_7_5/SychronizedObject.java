package chapter1_7_5;

public class SychronizedObject {
    private String username="a";
    private String password="aa";
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String name){
        this.username=name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    synchronized public void printString(String username,String password){
        try {
            this.username=username;
            Thread.sleep(10000);
            this.password=password;
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
