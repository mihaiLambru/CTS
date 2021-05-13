package ro.ase.cts.template;

public class SpectatorVIP extends SpectatorAbstract{
    private String nume;

    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAseazaLaCoada() {
        System.out.println("SpectatorulVIP "+nume+" nu a mai stat la coada.");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("SpectatorulVIP "+nume+" a prezentat biletul.");

    }

    @Override
    public void realizareControlCorporal() {
        System.out.println("SpectatorulVIP "+nume+" a fost controlat");

    }

    @Override
    public void ocupaLocul() {
        System.out.println("SpectatorulVIP "+nume+" a ocupat locul la loja.");

    }
}
