package org.example;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void buildSize() {
        pizza.setSize("Large");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Whole wheat");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Tomato sauce");
        pizza.addTopping("Mozzarella");
        pizza.addTopping("Peppers");
        pizza.addTopping("Mushrooms");
        pizza.addTopping("Onions");
        pizza.addTopping("Olives");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}