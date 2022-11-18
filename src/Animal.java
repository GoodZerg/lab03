import java.lang.String;
public abstract class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void moveTo(Animal animal){
        System.out.println(name + " подбежал к " + animal.name);
    }

    @Override
    public boolean equals(Object o) {
        Animal animal = (Animal) o;
        return name == animal.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void saySomething();
}
