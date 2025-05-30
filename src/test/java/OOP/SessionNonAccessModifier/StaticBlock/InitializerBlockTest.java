package OOP.SessionNonAccessModifier.StaticBlock;

public class InitializerBlockTest {

    private String name="Ana";

    static{
        System.out.println("Setting field");
  //      name="Test";
    }

    public InitializerBlockTest(){
        name="Serena";
        System.out.println("Setting constructor");
    }

    public static void main(String[] args) {
        InitializerBlockTest test=new InitializerBlockTest();
        System.out.println(test.name);
    }
}
