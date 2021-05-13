package ro.ase.cts.template;

public abstract class SpectatorAbstract {
    public abstract void seAseazaLaCoada();
    public abstract void prezentareBilet();
    public abstract void realizareControlCorporal();
    public abstract void ocupaLocul();

    public final void intrarePeStadion(){
        seAseazaLaCoada();;
        prezentareBilet();
        realizareControlCorporal();
        ocupaLocul();
    }
}
