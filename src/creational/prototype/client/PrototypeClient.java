package creational.prototype.client;

import creational.prototype.domain.Sheep;

public class PrototypeClient {
    public static void main(String[] args) {
        Sheep original = new Sheep("Jolly");

        Sheep cloned = new Sheep(original);
        cloned.setName("Dolly");

        System.out.println(original);
        System.out.println(cloned);

    }
}
