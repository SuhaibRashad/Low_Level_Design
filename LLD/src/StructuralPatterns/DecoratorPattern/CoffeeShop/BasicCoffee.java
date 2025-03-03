package StructuralPatterns.DecoratorPattern.CoffeeShop;

public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
