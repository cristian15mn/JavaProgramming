package OOP.SessionNonAccessModifier.FinalAccessModifier;

public class FinalExample {

    //final keyword poate fi aplicat pt outer class, inner class, variabile/field si metode
    //nu poate fi aplicata la interfete, constructor, block si enum

    //final class: nu poate fi extinsa/mostenita
    //final method: nu poate fi suprascrisa
    //o variaabila declarata si initializata final: nu poate fi schimbata

    static int a=123;

    static final  int ROTI_MASINA=4;

    public static void main(String[] args) {
        System.out.println("a= " + a);
        a=a++;

    }
}
