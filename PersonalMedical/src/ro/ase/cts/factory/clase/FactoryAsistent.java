package ro.ase.cts.factory.clase;

public class FactoryAsistent implements IFactory{
    @Override
    public PersonalSpital getPErsonal(String nume) {
        return new Asistent(nume);
    }
}
