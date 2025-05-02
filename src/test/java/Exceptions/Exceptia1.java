package Exceptions;

public class Exceptia1 {

    //Exceptiile reprezinta situatii care apar in timpul executiei unui program care determina oprirea acestuia
    //Ofera un mecanism eficient de identificare si rezolvare a erorilor
    //Sunt modelate sub forma de clase, spre ex: Clasa Error, Clasa Exception, Clasa RunTimeException si de asemenea putem s avem Clasa personalizata, daca dorim o exceptie personalizata
    //Exceptiile sunt gestionate folosind cuvinte predefinite in java: try, catch si finally
    //Sun 2 tipuri mari de exceptii: checked si unchecked
    //Exceptii checked=sunt exceptii de compilare(nu se poate rula sau face build la proiect); Exemple: SQLException, IOException, ClassNotFoundException, ele sunt nume de Clas ain java
    //Exceptii unchecked=sunt exceptii de RunTime care sunt ignorate in timpul compilarii, dar sunt aruncate in timpul excecutiei programului; Exemple: NullPointerException, ArrayIndexOutOfBound, ArithmeticException, ele sunt si nume de Clasa in java
    //2 cuvinte cheie pt exceptii:
    //throw=arunca exceptia in mod explicit de la o metoda sau un bloc de cod
    //throws=se foloseste odata cu metoda, care poate arunca un tip sau mai multe tipuri de exceptii

    public static void main(String[] args) throws ExceptiaCustom {
      //  try{
       //     System.out.println(12/0);
       // } catch (ArithmeticException e){
       //     System.out.println("Error arithmetic exception thrown: " + e.getMessage());
       // }

        try {
            int[] numbers=new int[10];
            numbers[11]=5;
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            throw new ExceptiaCustom("Eroare Custom!");
        }
        finally {
            System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa");
        }
    }
}
