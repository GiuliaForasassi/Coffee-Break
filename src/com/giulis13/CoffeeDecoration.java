package com.giulis13;

// Decorator
public abstract class CoffeeDecoration implements Coffee {

    // attributo
    protected Coffee coffee;

    // costruttore
    public CoffeeDecoration(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void addSugar() {
        coffee.addSugar();
    }
}
