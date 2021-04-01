package ro.ase.cts.builder;

public class Main {

    public static void main(String[] args){
        Rezervare rezervare1;
        Rezervare rezervare2;

        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        rezervareBuilder.setCodRezervare(100).setAreMancare(true);
        rezervare1 = rezervareBuilder.build();

        rezervare2 = new RezervareBuilder().setCodRezervare(101).setAreMuzicaAmbientala(true).build();

        Rezervare rezervare3 = new Rezervare(102,true,false,true,false,"rock");

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
    }
}
