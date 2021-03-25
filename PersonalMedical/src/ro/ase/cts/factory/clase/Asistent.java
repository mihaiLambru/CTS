package ro.ase.cts.factory.clase;

public class Asistent extends PersonalSpital {

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.getNume());
        sb.append('}');
        return sb.toString();
    }
}
