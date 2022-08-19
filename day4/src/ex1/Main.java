package ex1;

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> wrapper = new Wrapper<>(5,6);
        System.out.println(wrapper);
    }
}

class Wrapper <T extends Number>{
    T var1, var2;

    public Wrapper(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

//    T addNum(){
//        return this.var1 + this.var2;
//    }
}
