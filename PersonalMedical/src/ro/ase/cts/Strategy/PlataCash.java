package ro.ase.cts.Strategy;

public class PlataCash implements  IPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("A fost realizata plata cash in valoare de: "+ suma);
    }
}
