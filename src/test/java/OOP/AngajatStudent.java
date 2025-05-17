package OOP;

public class AngajatStudent extends Persoana implements AngajatInterfata, StudentInterfata{
    private String firma;
    private String experienta;
    private String zileCOncediu;

    private String facultate;
    private String an;
    private Boolean bursa;

    public AngajatStudent(String nume, String prenume, String varsta,
                          String firma, String experienta, String zileCOncediu,
                          String facultate, String an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileCOncediu = zileCOncediu;

        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    @Override
    public void mergeLaMunca() {

    }

    @Override
    public void primesteSalariu() {

    }

    @Override
    public void mergeInPauza() {

    }

    @Override
    public void prezintaDemisie() {

    }

    @Override
    public void mergeLaCurs() {

    }

    @Override
    public void sustineExamene() {

    }

    @Override
    public void mergeLaCafea() {

    }
}
