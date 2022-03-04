package creational.abstractfactory.factories;

import creational.abstractfactory.interfaces.Door;
import creational.abstractfactory.interfaces.DoorFittingExpert;

public interface DoorFactory {
    Door makeDoor();
    DoorFittingExpert makeFittingExpert();
}
