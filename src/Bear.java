public class Bear extends Animal{
    Bear(){
        setName("МЕДВЕД");
    }
    @Override
    public void saySomething(){
        System.out.println("МЕДВЕД сказал:");
        System.out.println("    придется придти");
    }
}
