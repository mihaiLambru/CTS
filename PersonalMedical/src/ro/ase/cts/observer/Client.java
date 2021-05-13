package ro.ase.cts.observer;

public class Client implements Observator {
    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(mesaj);
    }
}
