package OOP.Abstractizare.ClaseAbstracte;

public class Patrat extends FormeGeometrice {

    private int latura;

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

    @Override
    public void calculArie() {
        System.out.println("Aria patratului este: " + latura*latura);
    }
}
