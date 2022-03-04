package creational.simplefactory.client;

import creational.simplefactory.factories.DoorFactory;
import creational.simplefactory.interfaces.Door;

public class DoorFactoryClient {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100, 200);

        System.out.println(door.getWidth());
        System.out.println(door.getHeight());

        Door door1 = DoorFactory.makeDoor(50,100);
    }
}
