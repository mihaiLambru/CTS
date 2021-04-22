package ro.ase.cts.Flyweight;

public class Main {
    public static void main(String[] args){
        Rezervare rezervare = new Rezervare(10,5,10);
        Rezervare rezervare1 = new Rezervare(12,7,15);
        Rezervare rezervare2 = new Rezervare(15,2,20);
        Rezervare rezervare3 = new Rezervare(20,1,21);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getFlyweight("0725632145").printeazaRezervare(rezervare1);

        flyweightFactory.getFlyweight("0799999999").printeazaRezervare(rezervare2);

        flyweightFactory.getFlyweight("0725632145").printeazaRezervare(rezervare3);

    }
}
