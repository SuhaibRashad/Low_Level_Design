package StructuralPatterns.DecoratorPattern.CoffeeShop;

abstract class CoffeeDecorator implements Coffee{
    protected Coffee decorator;

    public CoffeeDecorator(Coffee coffee){
        this.decorator = coffee;
    }

    public String getDescription() {
        return decorator.getDescription();
    }

    @Override
    public double getCost() {
        return decorator.getCost();
    }
}
