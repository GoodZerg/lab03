public class Main {
    public static void main(String[] args) {
        //Rabbit rabbit = new Rabbit();
        Rabbit rabbit = new Rabbit();

        Animal[] animals = new Animal[3];
        animals[0] = rabbit;
        animals[1] = new Turtle();
        animals[2] = new Bear();

        for (int i = 1; i < animals.length; ++i){
            rabbit.amc.moveTo(animals[i]);
            rabbit.saySomething();
            animals[i].saySomething();
            System.out.println("");
        }

        for (int i = 1; i < animals.length; ++i){
            animals[i].asking();
            Rabbit.ThinkingComponent.answer();
        }

        for (Animal animal : animals) {
            animal.amc.chairAction();
        }

        System.out.println();
        rabbit.specialChairAction();
        rabbit.amc.chairAction();

    }
}