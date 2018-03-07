package com.giulis13;

import java.util.ArrayList;

// Concrete Decorator
public class WithLittleMilk extends CoffeeDecoration {

    // costruttore
    public WithLittleMilk(Coffee coffee) {
        super(coffee);
    }

    // viene ridefinito il nome
    @Override
    public String getName() {
        return coffee.getName() + " with a little milk";
    }

    // viene ridefinito il costo
    @Override
    public float getCost() {
        return (float) (coffee.getCost() + 0.50); // cast del float
    }

    // vengono ridefiniti gli ingredienti
    @Override
    public ArrayList<String> getIngredients() {
        ArrayList <String> list = coffee.getIngredients();
        list.add("Milk");
        return list;
    }

    // vengono ridefinite le calorie
    @Override
    public float getCalories() {
        return (float) (coffee.getCalories() + 7.5); // cast di float
    }
}
