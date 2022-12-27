public class Turtle extends Animal{
    Turtle(){
        setName("ЧЕРЕПАХА");
    }
    @Override
    public void saySomething(){
        System.out.println(getName() + " сказала:");
        System.out.println("    - Мне понравилосб, я приду");
    }
    @Override
    public void asking(){
        System.out.println(getName() + " сказала:");
        System.out.println("    - Как поживаешь?");
    }
}
