package ro.ase.cts.factory.clase;


public class FactoryMedic implements IFactory {
    @Override
    public PersonalSpital getPErsonal(String nume) {
        return new Medic(nume);
    }
}
