package com.giulis13;

// Singleton
public class Barman {

    // attributo
    private static Barman instance;

    // costruttore
    private Barman(){

    }

    // metodo statico per istanziare un Barman
    public static Barman getInstance(){
        if(instance == null){
            instance = new Barman();
        }
        return instance;
    }

    // metodo per fare un Espresso corto
    public Coffee makeLowEspresso(){
        Coffee espresso = new Espresso((float) 1.00, false);
        return espresso;
    }

    // metodo per fare un Espresso lungo
    public Coffee makeHighEspresso(){
        Coffee espresso = new Espresso((float) 1.00, true);
        return espresso;
    }

    // metodo per fare un Caffè Macchiato
    public Coffee makeMacchiato(){
        return new WithLittleMilk(makeLowEspresso());
    }

    // metodo per fare un Cappuccino
    public Coffee makeCappuccino(){
        return new WithLotsOfMilk(makeLowEspresso());
    }

    // metodo per fare un Caffè Corretto
    public Coffee makeCorrettoCoffee(String alcoholName){
        return new WithAlcohol(makeLowEspresso(), alcoholName);
    }

    // metodo per fare un Caffè con la cioccolata
    public Coffee makeChocolateCoffee(){
        return new WithChocolate(makeLowEspresso());
    }

    // metodo per fare un Mocaccino
    public Coffee makeMocaccino(){
        return new WithChocolate(makeCappuccino());
    }
}