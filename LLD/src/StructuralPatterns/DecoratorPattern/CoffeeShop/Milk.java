package StructuralPatterns.DecoratorPattern.CoffeeShop;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return decorator.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decorator.getCost() + 0.50;
    }
}
