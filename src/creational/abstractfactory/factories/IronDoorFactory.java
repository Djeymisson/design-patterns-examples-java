package creational.abstractfactory.factories;

import creational.abstractfactory.impls.door.IronDoor;
import creational.abstractfactory.impls.fittingexpert.Welder;
import creational.abstractfactory.interfaces.Door;
import creational.abstractfactory.interfaces.DoorFittingExpert;

// Iron door factory to get iron door and the relevant fitting expert
public class IronDoorFactory implements DoorFactory{
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
