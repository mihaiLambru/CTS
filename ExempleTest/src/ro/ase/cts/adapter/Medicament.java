package ro.ase.cts.adapter;

public class Medicament {
    private int id;
    private int numar;

    public Medicament(int id) {
        this.id = id;
        this.numar=0;
    }

    public Medicament(int id, int numar) {
        this.id = id;
        this.numar = numar;
    }

    public int getNumar() {
        return numar;
    }

    public int getId() {
        return id;
    }
}
