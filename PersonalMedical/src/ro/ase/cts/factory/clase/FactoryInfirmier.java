package ro.ase.cts.factory.clase;

public class FactoryInfirmier implements IFactory{
    @Override
    public PersonalSpital getPErsonal(String nume) {
        return new Infirmier(nume);
    }
}
