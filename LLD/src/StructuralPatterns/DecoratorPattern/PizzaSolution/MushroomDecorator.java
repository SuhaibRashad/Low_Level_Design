package StructuralPatterns.DecoratorPattern.PizzaSolution;

public class MushroomDecorator extends PizzaDecorator {
    private Pizza pizza;
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
        this.pizza = pizza;
    }
    public String getDescription(){
        return decoratedPizza.getDescription() + ", Mushroom";
    }
    public double getCost(){
        return this.pizza.getCost() + 1.00;
    }
}