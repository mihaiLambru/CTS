package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.VerificatorPersoane;

public class main {
    public static void main(String[] args){
        Persoana pers = new Persoana("Alex","1951015252675");
        if(VerificatorPersoane.isEligibile(pers)){
            System.out.println("Persoana este eligibila.");
        }
        else{
            System.out.println("Persoana nu este eligibila.");
        }
    }
}
