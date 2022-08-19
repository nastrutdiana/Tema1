package Pizza;

import java.util.ArrayList;

public class PizzaFactory {
    private static PizzaFactory instance;
    private Client client;
    private PizzaFactory(){

    }

    public static PizzaFactory getInstance(){
        if(instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }
    public void attachObserver(Client client){
        this.client = client;
    }
    public void notifyObserver(){
        System.out.println("Your pizza is ready!");
    }
    public Pizza createPizza(String type){
        switch (type){
            case "Marguerita":
                return new Marguerita();
            case "ProsciutoFunghi":
                return new ProsciutoFunghi();
            case "Capriciosa":
                return new Capriciosa();
            case "QuatroStagioni":
                return new QuatroStagioni();
            default:
                return null;
        }
    }

    class CommandOrder extends Commands{

        @Override
        public Pizza order(String order) {
            return createPizza(order);
        }
    }
}

class PizzaDecorator extends Pizza{
    private Pizza pizza;
    private ArrayList<String> toppings;
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    public void addToping(String topping){
        toppings.add(topping);
    }

    public Pizza getPizza() {
        return pizza;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }
}