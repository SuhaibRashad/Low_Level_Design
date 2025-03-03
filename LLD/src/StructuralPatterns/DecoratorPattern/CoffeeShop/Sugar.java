package StructuralPatterns.DecoratorPattern.CoffeeShop;


public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decorator.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decorator.getCost() + 0.30;
    }
}