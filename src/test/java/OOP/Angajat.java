package OOP;

public class Angajat extends Persoana {

    private String firma;
    private String experienta;
    private String zileCOncediu;

    public Angajat(String nume, String prenume, String varsta, String firma, String experienta, String zileCOncediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileCOncediu = zileCOncediu;
    }

    public void infoAngajat() {
        infoPersoana();
        System.out.println("Firma unde lucreaza: " + firma);
        System.out.println("Experienta pe care o are: " + experienta);
        System.out.println("Numarulul zilelor de concediu: " + zileCOncediu);
    }

    //Suprascriem metoda din Patinte9Clasa Persoana) polimorfism dinamic
    public void mananca() {
        System.out.println("Angajatul mananca cand are pauza de masa!");
    }

    public void promovare() {
        System.out.println("Angajatul cu numele " + getNume() + "a fost promovat");
    }

    //Polimorfism static
    public void marire() {
        System.out.println("Nu avem buget de marire!");
    }

    public void marire(Integer procent){
        System.out.println("Angajatul a primit o marire: " + procent + "%");
    }

    public void marire(String grad){
        System.out.println("Angajatul a primit gradul: " + grad);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    public String getZileCOncediu() {
        return zileCOncediu;
    }

    public void setZileCOncediu(String zileCOncediu) {
        this.zileCOncediu = zileCOncediu;
    }
}
