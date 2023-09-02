package designpattern.structural.decorator;

public class PizzaDecorator implements Pizza {
    private Pizza pizza; //element de tipul acelei interfete! Obligatoriu!!!

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        pizza.addIngredient(ingredient);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice();
    }
}