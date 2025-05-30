package OOP.SessionNonAccessModifier.StaticBlock.ex3;


public class AngajatTest {

    public static void main(String[] args) {

        System.out.println("Numar intitial angajat: " + Angajat.numarAngajat);
        Angajat angajat=new Angajat();
        angajat.numarAngajat();
        Angajat angajat2=new Angajat();
        angajat2.numarAngajat();

    }
}
