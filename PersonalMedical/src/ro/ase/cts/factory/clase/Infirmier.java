package ro.ase.cts.factory.clase;

public class Infirmier extends PersonalSpital{
    public Infirmier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Infirmier{");
        sb.append(super.getNume());
        sb.append('}');
        return sb.toString();
    }
}
