package ro.ase.cts.composite;

import jdk.jshell.spi.ExecutionControl;

public interface IMechanic {
    public void afiseazaDescriere();
    public void add(IMechanic mecanic) throws ExecutionControl.NotImplementedException;
    public void remove(IMechanic mecanic) throws ExecutionControl.NotImplementedException;
    public void getChild(IMechanic mecanic) throws ExecutionControl.NotImplementedException;
}
