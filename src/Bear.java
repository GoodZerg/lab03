public class Bear extends Animal{
    Bear(){
        setName("МЕДВЕД");
    }
    @Override
    public void saySomething(){
        System.out.println(getName() + " сказал:");
        System.out.println("     - придется придти");
    }
    @Override
    public void asking(){
        System.out.println(getName() + " спросил:");
        System.out.println("    - как дила?");
    }
}
