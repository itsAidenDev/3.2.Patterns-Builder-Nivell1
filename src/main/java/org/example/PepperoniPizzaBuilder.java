package org.example;

public class PepperoniPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void buildSize() {
        pizza.setSize("Large");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin crust");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Tomato sauce");
        pizza.addTopping("Mozzarella");
        pizza.addTopping("Pepperoni");
        pizza.addTopping("Oregano");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}