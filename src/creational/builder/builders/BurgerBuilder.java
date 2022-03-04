package creational.builder.builders;

import creational.builder.domain.Burger;

public class BurgerBuilder {

    public Double size;

    public Boolean cheese = false;
    public Boolean pepperoni = false;
    public Boolean lettuce = false;
    public Boolean tomato = false;

    public BurgerBuilder(Double size) {
        this.size = size;
    }

    public BurgerBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public BurgerBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public BurgerBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public Burger build() {
        return new Burger(this);
    }
}
