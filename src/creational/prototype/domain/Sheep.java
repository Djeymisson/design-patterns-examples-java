package creational.prototype.domain;

public class Sheep {

    protected String name;
    protected String category;

    public Sheep(Sheep sheep) {
        this(sheep.getName(), sheep.getCategory());
    }

    public Sheep(String name) {
        this(name, "Mountain Sheep");
    }

    public Sheep(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
