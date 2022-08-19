public class Calculator {
    public double add(double a, double b){
        return a + b;
    }

    public double substract(double a, double b){
        return a - b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double devide(double a, double b){
        if(b == 0)
            throw new ArithmeticException("cannot divide by zero");
        return a / b;
    }

}
