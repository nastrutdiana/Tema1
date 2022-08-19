public class Car extends Vehicle implements Driveable, Cloneable, Comparable<Car>{

    private int power;

    public Car(int power) {
        this.power = power;
    }

    @Override
    public void start() {
        System.out.println("ignition on");
        System.out.println("fuel pump on");
        System.out.println("engine started");
    }


    @Override
    int noOfDoors() {
        return 4;
    }

    @Override
    public void drive() {
        System.out.println("turn left");
    }

    Car clone(){
        return new Car();
    }

//    @Override
//    public int compareTo(Car o) {
//        if(this.power == o.power) return 0;
//        return this.power > o.power ? 1: -1;
//    }
//
    @Override
    public int compareTo(Car o){
        return this.power - o.power;
    }
}
