package org.factory;

public class Executor {

    public static void main(String[] args) {
        Sandwich sandwich=SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich.prepar();
       // Sandwich sandwich2=SandwichFactory.createSandwich(SandwichFactory.CHICKEN_BURGER);
       // Sandwich sandwich3=SandwichFactory.createSandwich(SandwichFactory.);


    }
}
