package core;

public class Singleton {
public  static Singleton single_instance =null;
    private Singleton(){}
    private void Demo(){
        System.out.println("Demo for Singlton");
    }

    public  static Singleton getInstance(){
        if(single_instance == null)
            single_instance = new Singleton();
        return  single_instance;
    }


    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        singleton.Demo();
    }
}
