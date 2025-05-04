package OOP.Abstractizare.Interfete;
import org.testng.annotations.Test;

public class OOPAbstractizareInterfataTest {

        @Test
        public void metodaTest(){
            Cerc formaCerc=new Cerc();
            formaCerc.setRaza(5);
            formaCerc.calculArie();

            Patrat formaPatrat=new Patrat();
            formaPatrat.setLatura(4);
            formaPatrat.calculArie();

        }
    }

