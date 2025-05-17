package OOP;

public class Persoana {

    //OOP-Programare Orientata Obiect
    //4 Principii: Mostenire, Incapsulare, Polimorfism, Abstractizare
    //MOSTENIREA: conceptul prin care o Clasa(Copil) mosteneste o alta Clasa(Parinte)
    //In java putem Mosteni o singura Clasa
    //In momentul cand o Clasa mosteneste o alta Clasa, Clasa Copil trebuie sa apeleze Constructorul din Parinte
    //In momentul in care se aplica Mostenirea, Clasa Copil are vizibilitatea asupra variabilelor/metodelor din Clasa Parinte
    //Constructoul din Clasa Parinte in Clasa Copil se apeleaza cu cuvantul:'super'
    //Mostenirea se face prinv cuvantul: 'extends'

    //INCAPSULAREA: procesul prin care tinem departe anumite informatii ca ele sa nu poata fi modificate
    //facem variabelele/metode din public in private
    //private=acess control care restrictioneaza accesul doar in Clasa respectiva
    //ca sa extragem/modificam o valoare a une variabile private, ne folosim de metode: 'get/getter' si 'set/setter'

    //POLIMORFISM: procesul prin  care definim mai multe implementari pt o metoda
    //Se aplica/obtine doar prin Mostenie!
    //Poate fi de 2 feluri: dinamic-override si static-overload
    //Polimorfism dinamic-override -> intr-o ierarhie de Clase obtinute prin Mostenire, o metoda poate avea implementari diferite
    //Ne folosim de cuvantul cheie 'super' ca sa apelam in Clasa Copil (in cazu nostru Student), metoda din Clasa Parinte (in cazu nostru Persoana)
    //Polimorfism static-overload -> posibilitatea prin care o metoda are mai multe implementari prin diferentierea numarului sau tipului de parametri

    //ABSTRACTIZARE: reducerea unui element complex la un elemnt mai simplu
    //Reducerea completa a implementarii metodelor lasand doar numele functiilor, parametri si tipul returnat
    //Se poate face prin Clase abstracte si/sau Interfete
    //Clasele Abstracte sunt utilizate pt a declara caractreistici comune unor sublase
    //o Clasa abstracta nu poate fi instantiata
    //ea poate fi utilizata numai ca si super Clasa pt alte Clase care extind alte Clasa abstracta
    //Clasa abstracta poate fi definita folosind modificatorul/cuv cheie 'abstract'
    //o Clasa abstracta poate contine atribute si metode, pe langa Clasa abstracta

    //INTERFATA: ofera raspunsul lipsei mostenirii multiple
    //Interfata creaza un protocol pe care clasele trebuie sa il implementeze (protocol-nu permite sa declari fields, doar sa declari metode PUR abstracte!)
    //Interfata este o Clasa unde toate metodele sunt abstracte (o Clasa PUR abstracta-adica doar metoda declarata, nu avem un body la metoda)!
    //Pt INterfete cuvantul cuvantul cheie 'implements' ca sa ne folosim de ele


    //MODIFICATORI DE ACCESS
    //public = codul se poate accesa de oriunde si de orice clasa
    //private = codul se poate accesa doar din clasa de unde s-a scris codul
    //protected = codul se poate accesa doar din pachetul in care s-a scris codul, dar si de catre sublase (conceptul OOP mostenire
    //defaul = codul se poate accesa doar din pachetul din care s-a scris codul, este defaul, daca nu se specifica un alt modificator de acces


    private String nume;
    private String prenume;
    private String varsta;

    public Persoana(String nume, String prenume, String varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    protected void infoPersoana(){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    //Definim prima implementare pt o metoda (Polimorfism dinamic)
    public void mananca(){

        System.out.println("Persoana mananca cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }
}
