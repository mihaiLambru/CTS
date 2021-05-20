package ro.ase.cts.singletone;

public class Locuinta {
    private String cod;

    public Locuinta() {
        this.cod=GeneratorCod.getInstance().genereaza();
    }
}
