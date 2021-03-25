package ro.ase.cts.Prototype;

public class Main {
    public static void main(String[] args){
        Reteta reteta = new Reteta("Paracetamol",250);
        PrototypeAbstract reteta1 =  reteta.copiaza();

        System.out.println(reteta);
        System.out.println(reteta1);

    }
}
