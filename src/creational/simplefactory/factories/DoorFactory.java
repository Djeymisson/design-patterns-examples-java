package creational.simplefactory.factories;

import creational.simplefactory.impls.WoodenDoor;
import creational.simplefactory.interfaces.Door;

public class DoorFactory {

    public static Door makeDoor(double width, double height) {
        return new WoodenDoor(width, height);
    }

}
