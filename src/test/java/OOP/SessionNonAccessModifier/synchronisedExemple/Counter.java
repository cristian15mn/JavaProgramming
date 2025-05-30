package OOP.SessionNonAccessModifier.synchronisedExemple;

public class Counter {

    //synchronized folosit pentru thread safety
    //synchronized modifier poate sa fie aplicat la metode si blocuri
    //
    int count;

    synchronized void increment(){
        count++;
    }
}
