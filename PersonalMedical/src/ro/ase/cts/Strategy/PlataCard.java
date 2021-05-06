package ro.ase.cts.Strategy;

public class PlataCard implements IPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("A fost efectuata plata cu cardul in valoare de "+suma);
    }
}
