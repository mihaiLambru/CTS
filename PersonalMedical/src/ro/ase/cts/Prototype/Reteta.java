package ro.ase.cts.Prototype;

public class Reteta implements PrototypeAbstract{
    private String denumireSolutie;
    private int candittate;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", candittate=").append(candittate);
        sb.append('}');
        return sb.toString();
    }

    public Reteta(String denumireSolutie, int candittate) {
        //validari
        this.denumireSolutie = denumireSolutie;
        this.candittate = candittate;
    }

    private Reteta() {
        //nu face validari
    }

    @Override
    public PrototypeAbstract copiaza() {
        Reteta copie = new Reteta();
        copie.candittate = this.candittate;
        copie.denumireSolutie = this.denumireSolutie;

        return copie;
    }
}
