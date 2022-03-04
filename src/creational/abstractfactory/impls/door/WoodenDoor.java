package creational.abstractfactory.impls.door;

import creational.abstractfactory.interfaces.Door;

public class WoodenDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("I am a wooden door");
    }
}
