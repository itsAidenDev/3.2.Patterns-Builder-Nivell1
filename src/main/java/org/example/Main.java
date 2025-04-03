package org.example;

public class Main {
    public static void main(String[] args) {
        MestrePizzer mestre = new MestrePizzer();

        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        mestre.setPizzaBuilder(hawaiianBuilder);
        mestre.constructPizza();
        Pizza hawaiianPizza = mestre.getPizza();
        System.out.println("Hawaiian Pizza: " + hawaiianPizza);

        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        mestre.setPizzaBuilder(vegetarianBuilder);
        mestre.constructPizza();
        Pizza vegetarianPizza = mestre.getPizza();
        System.out.println("Vegetarian Pizza: " + vegetarianPizza);

        PizzaBuilder pepperoniBuilder = new PepperoniPizzaBuilder();
        mestre.setPizzaBuilder(pepperoniBuilder);
        mestre.constructPizza();
        Pizza pepperoniPizza = mestre.getPizza();
        System.out.println("Pepperoni Pizza: " + pepperoniPizza);

        System.out.println("\nBuilding a custom pizza:");
        PizzaBuilder customBuilder = new PizzaBuilder() {
            private Pizza pizza = new Pizza();

            @Override
            public void buildSize() {
                pizza.setSize("Small");
            }

            @Override
            public void buildDough() {
                pizza.setDough("Gluten-free");
            }

            @Override
            public void buildToppings() {
                pizza.addTopping("White sauce");
                pizza.addTopping("Goat cheese");
                pizza.addTopping("Cherry tomatoes");
            }

            @Override
            public Pizza getPizza() {
                return pizza;
            }
        };

        mestre.setPizzaBuilder(customBuilder);
        mestre.constructPizza();
        Pizza customPizza = mestre.getPizza();
        System.out.println("Custom Pizza: " + customPizza);
    }
}