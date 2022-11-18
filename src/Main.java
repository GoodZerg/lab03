public class Main {
    public static void main(String[] args) {
        //Rabbit rabbit = new Rabbit();
        Rabbit rabbit = new Rabbit();
        Turtle turtle = new Turtle();
        Bear bear = new Bear();

        while (rabbit.appreciate() != BookCharacteristics.Good &&
                rabbit.appreciate() != BookCharacteristics.VeryGood){
            rabbit.reWrite();
        }
        rabbit.moveTo(turtle);
        rabbit.saySomething();
        turtle.saySomething();

        rabbit.moveTo(bear);
        rabbit.saySomething();
        bear.saySomething();


    }
}