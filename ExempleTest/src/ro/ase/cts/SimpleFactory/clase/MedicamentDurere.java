package ro.ase.cts.SimpleFactory.clase;

public class MedicamentDurere extends  Medicament{
    public MedicamentDurere(int pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentDurere{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
