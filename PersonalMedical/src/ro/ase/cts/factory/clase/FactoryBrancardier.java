package ro.ase.cts.factory.clase;

public class FactoryBrancardier implements  IFactory{
    @Override
    public PersonalSpital getPErsonal(String nume) {
        return new Brancardier(nume);
    }
}
