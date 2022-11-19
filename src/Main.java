public class Main {
    public static void main(String[] args) {
        //Rabbit rabbit = new Rabbit();
        Rabbit rabbit = new Rabbit();

        while (rabbit.appreciate() != BookCharacteristics.Good &&
                rabbit.appreciate() != BookCharacteristics.VeryGood){
            rabbit.reWrite();
        }

        Animal[] animals = new Animal[2];
        animals[0] = new Turtle();
        animals[1] = new Bear();

        for (int i = 0; i < animals.length; ++i){
            rabbit.moveTo(animals[i]);
            rabbit.saySomething();
            animals[i].saySomething();
            System.out.println("");
        }
    }
}