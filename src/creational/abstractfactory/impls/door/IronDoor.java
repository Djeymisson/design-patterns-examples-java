package creational.abstractfactory.impls.door;

import creational.abstractfactory.interfaces.Door;

public class IronDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("I am an iron door");
    }
}
