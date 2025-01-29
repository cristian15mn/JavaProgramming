package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //StructuriAlternative = if - then - else; switch-case;

    @Test
    public void metodaTest(){
//        metodaVfNr(7);
//        metodaVfNr(4);
//        metodaVfNr(5);
        metodaVfNrParPozitiv(0);
        metodaVfNrParPozitiv(-9);
        metodaVfNrParPozitiv(4);
        metodaVfNrParPozitiv(-8);

    }


    //vf un nr mai mare decat 5
    public void metodaVfNr(int nr){
        if (nr>5){
            System.out.println("Nr " +nr +" este mai mare decat 5");
        }
        else if (nr<5){
            System.out.println("Nr " +nr +" este mai mic decat 5");
        }
        else{
            System.out.println("Nr " +nr +" este egal cu 5");
        }
    }


    //vf daca un nr este par pozitiv sau negativ
    public void metodaVfNrParPozitiv(int a) {
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("Nr " + a + " este par pozitiv");
            } else {
                System.out.println("Nr " + a + " este impar pozitiv");
            }
        }
        else if (a < 0) {
            if (a % 2 == 0) {
                System.out.println("Nr " + a + " este par negativ");
            } else {
                System.out.println("Nr " + a + " este impar negativ");
            }
        } else if(a==0){
            System.out.println("Nr " + a +" este egal cu 0");
        }
    }
}
