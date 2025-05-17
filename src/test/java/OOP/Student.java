package OOP;

public class Student extends Persoana implements StudentInterfata {

    private String facultate;
    private String an;
    private Boolean bursa;

    public Student(String nume, String prenume, String varsta, String facultate, String an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    public void infoStudent() {
        infoPersoana();
        System.out.println("Studentul este la Facultatea: " + facultate);
        System.out.println("Studentul este in anul: " + an);
        System.out.println("Studentul este are bursa: " + bursa);
    }

    public void absolvire(){
        System.out.println("Studentul cu " + getNume() + " si prenumele " + getPrenume() + "a absolvit");
    }

    public void mananca(){
        System.out.println("Studentul mananca cand are timp!");
       // super.mananca();
    }

    public String getFacultate() {
        return facultate;
    }

    public String getAn() {
        return an;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }


    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul merge la curs");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul are sesiune");
    }

    @Override
    public void mergeLaCafea() {
        System.out.println("Studentul este silitor");
    }
}
