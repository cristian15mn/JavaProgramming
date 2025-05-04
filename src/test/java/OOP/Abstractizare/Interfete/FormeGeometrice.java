package OOP.Abstractizare.Interfete;

public interface FormeGeometrice {

    //permite doar Constante nu si fielduri/proprietati care nu sunt intitializate
     public static final String culoare="red";

     //toate metodele declarate sunt by default Abstracte in Interfata
    void calculArie();

    void deseneaza();

}
