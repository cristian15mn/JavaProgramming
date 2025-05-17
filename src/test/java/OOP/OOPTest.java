package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void metodaTest(){
       Student student1 =new Student("Negrea", "Cristian", "32", "ETTI", "4", true);

//       student1.infoStudent();
//        student1.mananca();

        Angajat angajat1=new Angajat("Pop", "Mihai","30", "Mango","4 ani", "10");
        angajat1.infoAngajat();
        angajat1.mananca();

        angajat1.marire();
        angajat1.marire(10);
        angajat1.marire("Senior");

    }
}
