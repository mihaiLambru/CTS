package ro.ase.cts.SimpleFactory.clase;

public class MedicamentBody extends Medicament{
    public MedicamentBody(int pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentBody{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
