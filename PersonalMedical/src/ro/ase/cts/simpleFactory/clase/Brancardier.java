package ro.ase.cts.simpleFactory.clase;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.getNume());
        sb.append('}');
        return sb.toString();
    }
}
