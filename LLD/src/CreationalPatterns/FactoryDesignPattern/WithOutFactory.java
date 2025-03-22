package CreationalPatterns.FactoryDesignPattern;

interface Transport{
    void deliver();
}

class Car implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered by Car");
    }
}

class Bike implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered by Bike");
    }
}
class Bus implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered by Bus");
    }
}

public class WithOutFactory {
    public static void main(String[] args) {
        Transport car = new Car();
        car.deliver();
        Transport bike = new Bike();
        //add a bus object
        Transport bus = new Bus();
    }
}
