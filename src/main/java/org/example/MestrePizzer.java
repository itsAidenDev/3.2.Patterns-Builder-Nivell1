package org.example;

public class MestrePizzer {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.buildSize();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildToppings();
    }
}