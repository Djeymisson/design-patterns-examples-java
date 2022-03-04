package creational.abstractfactory.factories;

import creational.abstractfactory.impls.door.WoodenDoor;
import creational.abstractfactory.impls.fittingexpert.Carpenter;
import creational.abstractfactory.interfaces.Door;
import creational.abstractfactory.interfaces.DoorFittingExpert;

// Wooden factory to return carpenter and wooden door
public class WoodenDoorFactory implements DoorFactory{
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}
