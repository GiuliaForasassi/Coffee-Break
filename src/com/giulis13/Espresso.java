package com.giulis13;

import java.util.ArrayList;

// Concrete Component
public class Espresso implements Coffee {

    // attributi
    private float cost;
    private boolean high;
    private ArrayList <String> ingredients;
    private float calories;
    private int sugar;

    // costruttore
    public Espresso(float cost, boolean high) {
        this.cost = cost;
        this.high = high;
        this.ingredients = new ArrayList<String>();
        ingredients.add("Coffee");
        this.calories = (float) 2.5;
        this.sugar = 0;
    }

    // metodo per guardare il nome del caffè
    @Override
    public String getName() {
        String name;
        if(high)
            name = "High Coffee";
        else
            name = "Low Coffee";

        // per cambiare il nome in caso ci sia lo zucchero
        if(sugar > 0){
            name = name + " with sugar";

        }
        return name;
    }

    // metodo per ottenere il costo del caffè
    @Override
    public float getCost() {
        return cost;
    }


    // metodo per ottenere gli ingredienti del caffè
    @Override
    public ArrayList<String> getIngredients() {
        return ingredients;

    }

    // metodo per ottenere le calorie del caffè
    @Override
    public float getCalories() {
        return calories;
    }

    // metodo che ritorna l'altezza del caffè
    public boolean isHigh() {
        return high;
    }

    // metodo per aggiungere lo zucchero
    public void addSugar(){
        if(sugar == 0) {
            ingredients.add("Sugar");
        }
        sugar ++;
        calories = calories + 20;
    }
}
