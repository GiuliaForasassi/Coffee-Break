package com.giulis13;

import java.util.ArrayList;

// Concrete Decorator
public class WithChocolate extends CoffeeDecoration{

    // costruttore
    public WithChocolate(Coffee coffee) {
        super(coffee);
    }

    // viene ridefinito il nome
    @Override
    public String getName() {
        return coffee.getName() + " with chocolate";
    }

    // viene ridefinito il costo
    @Override
    public float getCost() {
        return (float) (coffee.getCost() + 0.80); // cast del float
    }

    // vengono ridefiniti gli ingredienti
    @Override
    public ArrayList<String> getIngredients() {
        ArrayList <String> list = coffee.getIngredients();
        list.add("Chocolate");
        return list;
    }

    // vengono ridefinite le calorie
    @Override
    public float getCalories() {
        return coffee.getCalories() + 13;
    }
}
