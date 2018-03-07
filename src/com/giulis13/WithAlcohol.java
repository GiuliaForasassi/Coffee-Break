package com.giulis13;

import java.util.ArrayList;

// Concrete Decorator
public class WithAlcohol extends CoffeeDecoration {

    private String alcoholName;

    // costruttore
    public WithAlcohol(Coffee coffee, String alcoholName) {
        super(coffee);
        this.alcoholName = alcoholName;
    }

    // viene ridefinito il nome
    @Override
    public String getName() {
        return coffee.getName() + " with " + alcoholName;
    }

    // viene ridefinito il costo
    @Override
    public float getCost() {
        return (float) (coffee.getCost() + 1.00); // cast del float
    }

    // vengono ridefiniti gli ingredienti
    @Override
    public ArrayList<String> getIngredients() {
        ArrayList <String> list = coffee.getIngredients();
        list.add("Alcohol");
        return list;
    }

    // vengono ridefinite le calorie
    @Override
    public float getCalories() {
        return (float) (coffee.getCalories() + 22.5); // cast del float
    }
}
