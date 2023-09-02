package designpattern.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class BasePizza implements Pizza {
    private List<Ingredient> ingredientList;

    public BasePizza() {
        ingredientList = new ArrayList<>();
        ingredientList.add(new Ingredient("dough", 12));
        ingredientList.add(new Ingredient("tomato sauce", 3));
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Ingredient ingredient : ingredientList) {
            sum += ingredient.getPrice();
        }
        return sum;
    }
}