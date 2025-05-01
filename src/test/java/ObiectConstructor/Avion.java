package ObiectConstructor;

public class Avion {

    //Constructor=are ca rol sa initializeze variabilele unei clase
    //Recunoastem un Constructor dupa numele Clasei; Constructorul este in cazul asta=Avion
    //Intr-o Clasa putem avea n Constructori care se diferentiaza dupa numarul sau tipul de parametri
    //Exista 3 tipuri de Construcotri: Cu parametri sau fara parametri
    //Intr-o Clasa avem tot timpul un Contructor default(fara parametri)
    //Constructorul trebuie sa fie public!
    //Constructorul Singleton poate sa fie si private

    //Obiect=instanta unei clase
    //Dintr-o Clasa putem sa facem mai multe obiecte
    //Ca sa intializam un Obiect ne folosim de cuvantul 'new'
    //Cand se initializeaza un Obiect se apeleaza Constructorul Clasei

    public String tipAvion;
    public String marcaAvion;
    public String modelAvion;
    public Integer capacitatePasageriAvion;
    public String tipCombustibilAvion;
    public Integer numarBagajAvion;

    public Avion(String tipAvion, String marcaAvion, String modelAvion, Integer capacitatePasageriAvion, String tipCombustibilAvion) {
        this.tipAvion = tipAvion;
        this.marcaAvion = marcaAvion;
        this.modelAvion = modelAvion;
        this.capacitatePasageriAvion = capacitatePasageriAvion;
        this.tipCombustibilAvion = tipCombustibilAvion;
    }

    public Avion(String tipAvion, String marcaAvion, String modelAvion, Integer capacitatePasageriAvion, String tipCombustibilAvion, Integer numarBagajAvion) {
        this.tipAvion = tipAvion;
        this.marcaAvion = marcaAvion;
        this.modelAvion = modelAvion;
        this.capacitatePasageriAvion = capacitatePasageriAvion;
        this.tipCombustibilAvion = tipCombustibilAvion;
        this.numarBagajAvion = numarBagajAvion;
    }

    public void prezentareAvion() {
        System.out.println("Tipul avionului este: " + tipAvion);
        System.out.println("Marca avionului este: " + marcaAvion);
        System.out.println("Model avionului este: " + modelAvion);
        System.out.println("Capacitatea avionului ese: " + capacitatePasageriAvion);
        System.out.println("Tipul de combustibil este: " + tipCombustibilAvion);
        if (numarBagajAvion != null) {
            System.out.println("Numarul de bagaje este: " + numarBagajAvion);
        } else {
            System.out.println("Avionul nu are bagaje!");
        }
    }


}
