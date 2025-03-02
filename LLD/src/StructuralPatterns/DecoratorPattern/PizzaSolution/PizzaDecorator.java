package StructuralPatterns.DecoratorPattern.PizzaSolution;


abstract class PizzaDecorator implements Pizza{
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratedPizza = pizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Decorated";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}

