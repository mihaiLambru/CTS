package ro.ase.cts.SimpleFactory.clase;

public abstract class Medicament {
    private int pret;
    private String Denumire;

    public Medicament(int pret, String denumire) {
        this.pret = pret;
        Denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("pret=").append(pret);
        sb.append(", Denumire='").append(Denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
