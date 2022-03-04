package creational.builder.domain;

import creational.builder.builders.BurgerBuilder;

public class Burger {
    protected Double size;

    protected Boolean cheese;
    protected Boolean pepperoni;
    protected Boolean lettuce;
    protected Boolean tomato;

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }
}
