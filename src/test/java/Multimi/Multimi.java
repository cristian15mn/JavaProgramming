package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    //Multimi: Array, List, Map

    @Test
    public void metodaTest(){
       // colegiCursArrayFor();
        //colegiCursListWhile();
        //categoriObiecte();
        tariOrase();

    }

    //Exemplu Array
    public void colegiCursArrayFor(){
        String[] colegi=new String[6];
        colegi[0]="Cristian";
        colegi[1]="Mihai";
        colegi[2]="Andrei";
        colegi[3]="Marius";
        colegi[4]="Alex";
        colegi[5]="Maria";

        for (int index=0;index<colegi.length;index++){
            System.out.println("Numele colegului este: " + colegi[index]);
        }
    }


    //Exemplu List
    public void colegiCursListWhile(){
        List<String> colegi= new ArrayList<>();
        colegi.add("Cristian");
        colegi.add("Mihai");
        colegi.add("Marius");
        colegi.add("Alex");
        colegi.add("Maria");
        colegi.add("Andrei");

        int index=0;
        while (index<colegi.size()){
            System.out.println("Numele colegului este: " + colegi.get(index));
            index++;
        }
    }


    //Exemplu Map
    // Definitie Map: cheie=valore!!!
    public void categoriObiecte()
    {
        HashMap<String,String> obiecte=new HashMap<>();
        obiecte.put("obiect","laptop");
        obiecte.put("fruct","mar");
        obiecte.put("floare","trandafir");

        for (String key: obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));
        }
    }


    //Exemplu cu aceaiasi Cheie, dar Valoare diferita
    public void tariOrase(){
        HashMap<String,List<String>> clasificare=new HashMap<>();

        List<String> oraseRomania=new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Sibiu");
        oraseRomania.add("Brasov");

        List<String> oraseItalia=new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Florenta");
        oraseItalia.add("Milano");

        List<String> oraseSpania=new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Palma");
        oraseSpania.add("Madrid");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String key: clasificare.keySet()){
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));
        }
    }
}
