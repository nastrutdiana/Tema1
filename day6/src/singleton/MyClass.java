package singleton;

public class MyClass {

    private static MyClass instance;

    private MyClass(){

    }
    public static MyClass getInstance(){
        if (instance != null){
            return instance;
        }
        else {
            instance = new MyClass();
            return instance;
        }
    }
}
