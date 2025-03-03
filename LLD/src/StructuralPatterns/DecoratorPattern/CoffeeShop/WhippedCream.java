package StructuralPatterns.DecoratorPattern.CoffeeShop;


public class WhippedCream extends CoffeeDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decorator.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return decorator.getCost() + 0.70;
    }
}
