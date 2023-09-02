package designpattern.structural.decorator;

import org.w3c.dom.ls.LSOutput;

public class DecoratorMain {
    public static void main(String[] args) {
        Ingredient mushrooms = new Ingredient("ciuperci", 2);
        Pizza originalPizza = new BasePizza();
        PizzaDecorator pizzaDecorator = new PizzaDecorator(originalPizza);
        pizzaDecorator.addIngredient(mushrooms);
        pizzaDecorator.addIngredient(new Ingredient("mozzarella", 5));
        System.out.println(pizzaDecorator.getPrice());
    }
}