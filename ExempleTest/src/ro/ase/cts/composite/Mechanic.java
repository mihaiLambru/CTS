package ro.ase.cts.composite;

import jdk.jshell.spi.ExecutionControl;

public class Mechanic implements IMechanic{
    @Override
    public void afiseazaDescriere() {

    }

    @Override
    public void add(IMechanic mecanic) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Eroare");
    }

    @Override
    public void remove(IMechanic mecanic) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Eroare");

    }

    @Override
    public void getChild(IMechanic mecanic) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Eroare");


    }
}
