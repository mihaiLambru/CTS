package cts.lambru.mihai.gr1081.command;

public abstract class Cerere {
    private TipCerere tipCerere;
    private String denumire;

    public Cerere(TipCerere tipCerere, String denumire) {
        this.tipCerere = tipCerere;
        this.denumire = denumire;
    }
    public abstract void solicita();
}
