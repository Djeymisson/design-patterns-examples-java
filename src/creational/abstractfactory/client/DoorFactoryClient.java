package creational.abstractfactory.client;

import creational.abstractfactory.factories.IronDoorFactory;
import creational.abstractfactory.factories.WoodenDoorFactory;
import creational.abstractfactory.interfaces.Door;
import creational.abstractfactory.interfaces.DoorFittingExpert;

public class DoorFactoryClient {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();

        Door woodenDoor = woodenDoorFactory.makeDoor();
        DoorFittingExpert woodenExpert = woodenDoorFactory.makeFittingExpert();

        woodenDoor.getDescription();
        woodenExpert.getDescription();

        // Same for Iron factory
        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        Door ironDoor = ironDoorFactory.makeDoor();
        DoorFittingExpert ironExpert = ironDoorFactory.makeFittingExpert();

        ironDoor.getDescription();
        ironExpert.getDescription();
    }
}
