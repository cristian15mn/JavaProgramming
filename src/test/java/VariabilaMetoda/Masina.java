package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricatie;


    @Test
    public void metodaTest(){
//        dateMasina("Audi","Q3",2022);
//        dateMasina("BMW","GT",2023);
//        calculMedie(5.0,10.0);
//        calculMedie(8.3,9.5);
       // citireNote();
    }



    public void dateMasina(String param1, String param2, Integer param3){
        marca=param1;
        model=param2;
        anFabricatie=param3;

        System.out.println("Marca masinii este: "+marca);
        System.out.println("Modelul masinii este: "+model);
        System.out.println("Anul masinii este: "+anFabricatie);
    }

    //calculam media la 2 numere
    public void calculMedie(Double nota1, Double nota2){
        Double rezultat=(nota1+nota2)/2;
        System.out.println("Media este egala cu: "+rezultat);
    }

    public void citireNote(){
        Scanner scanner=new Scanner(System.in);
        int nota=scanner.nextInt();
        while (nota<1 || nota>10){
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog introdu o nota valida!");
            nota=scanner.nextInt();
        }
        System.out.println("Nota " + nota + " este intre 1 si 10.");
    }

}
