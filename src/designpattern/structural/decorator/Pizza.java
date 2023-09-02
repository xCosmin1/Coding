package designpattern.structural.decorator;

public interface Pizza {
    void addIngredient(Ingredient ingredient);

    int getPrice();
}