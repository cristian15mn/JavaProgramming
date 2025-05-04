package OOP.Abstractizare.ClaseAbstracte;

public abstract  class FormeGeometrice {

    public String culoare;

    public abstract void calculArie();

    public void deseneaza(){
        System.out.println("Desenaza forma");
    }
}
