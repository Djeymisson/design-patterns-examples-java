package creational.simplefactory.impls;

import creational.simplefactory.interfaces.Door;

public class WoodenDoor implements Door {
    private Double width;
    private Double height;

    public WoodenDoor(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
