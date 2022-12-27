import java.lang.String;
public abstract class Animal {
    private String name;

    public AnimalMovementComponent amc = new AnimalMovementComponent();
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public class AnimalMovementComponent implements CanChairAction{
        public void moveTo(Animal animal){
            System.out.println(name + " подбежал к " + animal.name);
        }

        @Override
        public void chairAction(){
            System.out.println(name + " сел на стул");
        }
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
    public abstract void asking();

}
