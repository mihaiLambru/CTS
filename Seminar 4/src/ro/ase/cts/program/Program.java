package ro.ase.cts.program;

import ro.ase.cts.clase.DoctorFamilie;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {
    public static void main(String[] args){
//        Presedinte presedinte1 = Presedinte.getInstance();
//        Presedinte presedinte2 = Presedinte.getInstance();
//
//        presedinte1.setMandat(5);
//        presedinte2.setNume("Basescu");
//
//        System.out.println(presedinte1.toString());
//        System.out.println(presedinte2.toString());
//
//        PresedinteLazy presedinte3 = PresedinteLazy.getInstance("Trump", 40, 2);
//        PresedinteLazy presedinte4 = PresedinteLazy.getInstance("Iohanis",20,1);
//
//
//        System.out.println(presedinte3.toString());
//        System.out.println(presedinte4.toString());

        DoctorFamilie doctor = DoctorFamilie.getInstance();
        DoctorFamilie doctor2 = DoctorFamilie.getInstance("Safta" , 78,false);

        System.out.println(doctor.toString());
        System.out.println(doctor2.toString());
    }

}
