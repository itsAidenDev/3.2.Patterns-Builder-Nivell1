package org.example;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void buildSize() {
        pizza.setSize("Medium");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Regular");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Tomato sauce");
        pizza.addTopping("Mozzarella");
        pizza.addTopping("Ham");
        pizza.addTopping("Pineapple");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}