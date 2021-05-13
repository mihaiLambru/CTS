package ro.ase.cts.SimpleFactory.clase;

public class MedicamentRaceala extends Medicament{

    public MedicamentRaceala(int pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentRaceala{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
