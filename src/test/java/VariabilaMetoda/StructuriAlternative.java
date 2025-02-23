package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //StructuriAlternative = if - then - else; switch-case;

    @Test
    public void metodaTest(){
//        metodaVfNr(7);
//        metodaVfNr(4);
//        metodaVfNr(5);
//        metodaVfNrParPozitiv(0);
//        metodaVfNrParPozitiv(-9);
//        metodaVfNrParPozitiv(4);
//        metodaVfNrParPozitiv(-8);
       // zileSaptamana(3);
        test();

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
                System.out.println("Nr " + a +" este par pozitiv");
            } else {
                System.out.println("Nr " + a +" este impar pozitiv");
            }
        }
        else if (a < 0) {
            if (a % 2 == 0) {
                System.out.println("Nr " + a +" este par negativ");
            } else {
                System.out.println("Nr " + a +" este impar negativ");
            }
        } else if(a==0){
            System.out.println("Nr " + a +" este egal cu 0");
        }
    }


    //Exemplu switch case
    //'switch' case are VALOARE, in schimb 'if' are CONDITIE
    //de preferat este mai simplu sa folosesc 'switch' case atunci cand sunt anumite valori, de exemplu cand interactionez cu Meniuri si Submeniuri!!!
    //pe site-ul nostru DemoQA sunt 6 Meniuri

    public void zileSaptamana(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            default:
                System.out.println("Nu mai sunt zile!");
        }
    }

    public void test(){
        int nr=2;
        switch (nr){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
