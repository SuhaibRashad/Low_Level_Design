package StructuralPatterns.DecoratorPattern.PizzaSolution;


public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();

        //Add Cheese
//        pizza = new CheeseDecorator(pizza);
//        pizza = new OliveDecorator(pizza);
//        pizza = new MushroomDecorator(pizza);

        pizza = new OliveDecorator(new CheeseDecorator(new MushroomDecorator(pizza)));


        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}

