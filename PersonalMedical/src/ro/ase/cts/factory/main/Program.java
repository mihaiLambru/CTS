package ro.ase.cts.factory.main;

import ro.ase.cts.factory.clase.*;

public class Program {
    private static void afisareInformatiiPersonal(IFactory factory,String nume){
        PersonalSpital personalSpital=factory.getPErsonal(nume);
        System.out.println(personalSpital.toString());
    }

    public static void main(String[] args){
        afisareInformatiiPersonal(new FactoryAsistent(),"Mircea");
        afisareInformatiiPersonal(new FactoryBrancardier(),"Ionut");
        afisareInformatiiPersonal(new FactoryInfirmier(),"George");

        FactoryAsistent asistentFactory = new FactoryAsistent();
        Asistent asistent = (Asistent) asistentFactory.getPErsonal("Mihai-Alexandru");
        System.out.println("Facut de mine: " + asistent.toString() );


    }
}
