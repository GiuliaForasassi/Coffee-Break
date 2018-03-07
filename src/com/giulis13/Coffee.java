package com.giulis13;

import java.util.ArrayList;

// Component
public interface Coffee {

    String getName();
    float getCost();
    ArrayList <String> getIngredients();
    float getCalories();
    void addSugar();
}
