package ro.ase.cts.template;

public class Spectator extends SpectatorAbstract{
    private String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAseazaLaCoada() {
        System.out.println("Spectatorul "+nume+" s-a asezat la coasa.");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("Spectatorul "+nume+" a prezentat biletul.");

    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("Spectatorul "+nume+" a fost controlat");

    }

    @Override
    public void ocupaLocul() {
        System.out.println("Spectatorul "+nume+" a ocupat locul.");

    }
}
