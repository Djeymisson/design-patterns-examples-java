package creational.builder.client;

import creational.builder.builders.BurgerBuilder;
import creational.builder.domain.Burger;

public class BuilderClient {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder(14D)
                .addCheese()
                .addLettuce()
                .addPepperoni()
                .build();

        System.out.println(burger);
    }
}
