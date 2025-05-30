package OOP.SessionNonAccessModifier.valueVsreferenceType.ex2;

public class MainReferenceTest {

    public static void main(String[] args) {
        ReferenceTest ref1=new ReferenceTest();
        System.out.println(ref1);

        ReferenceTest ref2 =new ReferenceTest();
        System.out.println(ref2);

        if (ref1==ref2){
            System.out.println("referintele sunt egale");
        }else{
            System.out.println("Refereintele nu sunt egale");
        }
    }
}
