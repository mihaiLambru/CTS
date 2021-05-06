package ro.ase.cts.Strategy;

public class Program {
    public static void main(String[] args){
        Client client = new Client("Alice");

        client.plateste(30);
        client.setTipPlata(new PlataCash());
        client.plateste(25);
    }
}
