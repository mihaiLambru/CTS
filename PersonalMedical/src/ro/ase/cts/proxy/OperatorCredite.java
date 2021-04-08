package ro.ase.cts.proxy;

public class OperatorCredite implements  IOperatorCredite{

    @Override
    public void creareCredit(int suma, Moneda moneda) {
        System.out.println("A fost aprobat creditul de " + suma + " " + moneda);
    }
}
