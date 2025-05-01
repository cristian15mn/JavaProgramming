package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test
    public void metodaTest(){
        Avion avion1=new Avion("Pasageri", "Airbus", "A-320", 180, "Kerosen");
        avion1.prezentareAvion();

        Avion avion2=new Avion("Cargo", "Boeing", "B-777", 3, "Eco");
        avion2.prezentareAvion();

        Avion avion3=new Avion("Pasageri", "Airbus", "A-321", 190, "Kerosen", 10);
        avion3.prezentareAvion();
    }
}
