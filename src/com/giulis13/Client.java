package com.giulis13;

public class Client {

    public static void main(String[] args) {

        // creazione del Barman
        Barman barman = Barman.getInstance();
        System.out.println("The barman is ready to make a coffee!");

        System.out.println("\n");

        // creazione dell'Espresso corto
        Coffee coffee = barman.makeLowEspresso();
        printResults(coffee);

        // creazione dell'Espresso lungo
        Coffee coffee1 = barman.makeHighEspresso();
        printResults(coffee1);

        // creazione dell'Espresso corto zuccherato
        coffee = barman.makeLowEspresso();
        coffee.addSugar();
        printResults(coffee);

        // creazione dell'Espresso lungo zuccherato
        coffee1 = barman.makeHighEspresso();
        coffee1.addSugar();
        coffee1.addSugar();
        printResults(coffee1);

        // creazione del caffè Macchiato
        Coffee coffee2 = barman.makeMacchiato();
        printResults(coffee2);

        // creazione del Cappuccino
        Coffee coffee3 = barman.makeCappuccino();
        printResults(coffee3);

        // creazione del caffè Corretto con grappa
        Coffee coffee4 = barman.makeCorrettoCoffee("grappa");
        printResults(coffee4);

        // creazione del caffè Corretto con sambuca
        Coffee coffee5 = barman.makeCorrettoCoffee("sambuca");
        printResults(coffee5);

        // creazione del caffè con Cioccolata
        Coffee coffee6 = barman.makeChocolateCoffee();
        printResults(coffee6);

        // creazione del Mocaccino
        Coffee coffee7 = barman.makeMocaccino();
        printResults(coffee7);
    }

    // funzione per stampare i risultati ottenuti
    public static void printResults(Coffee coffee){

        System.out.println("The barman made a " + coffee.getName());
        System.out.println("The client spends " + coffee.getCost());
        System.out.println("The calories of this coffee are: " + coffee.getCalories());
        System.out.println("The coffee choose by the client contains these ingredients: " + coffee.getIngredients());

        System.out.println("\n");
    }
}
