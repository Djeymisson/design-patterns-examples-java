package creational.abstractfactory.impls.fittingexpert;

import creational.abstractfactory.interfaces.DoorFittingExpert;

public class Welder implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("I can only fit iron doors");
    }
}
