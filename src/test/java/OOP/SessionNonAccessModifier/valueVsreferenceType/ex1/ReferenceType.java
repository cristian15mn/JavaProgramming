package OOP.SessionNonAccessModifier.valueVsreferenceType.ex1;

public class ReferenceType {

    public static void main(String[] args) {
        String myString1= new String("hello");
        String myString2=new String("hello");
    //    String myString2=myString1;

        int integer1=5;
        int integer2=5;

        if(integer1==integer2){  //se compara valorile
            System.out.println("valorile sunt la fel");
        }else{
            System.out.println("valorile nu sunt la fel");
        }

        System.out.println("---------------------------------------");

        if (myString1==myString2){  //se compara refrinta
            System.out.println("valorile sunt la fel");
        }else {
            System.out.println("valorile nu sunt la fel");
        }
    }
}
