public class Turtle extends Animal{
    Turtle(){
        setName("ЧЕРЕПАХА");
    }
    @Override
    public void saySomething(){
        System.out.println("ЧЕРЕПАХА сказала:");
        System.out.println("    Мне понравилосб, я приду");
    }

}
