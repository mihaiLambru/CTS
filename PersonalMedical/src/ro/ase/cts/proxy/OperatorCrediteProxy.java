package ro.ase.cts.proxy;

public class OperatorCrediteProxy implements IOperatorCredite{
    public OperatorCredite operator;

    public OperatorCrediteProxy(OperatorCredite operator) {
        this.operator = operator;
    }

    @Override
    public void creareCredit(int suma, Moneda moneda) {
        if(moneda == Moneda.RON){
            operator.creareCredit(suma,moneda);
        }
        else System.out.println("Banca la acest moment ofera credite exclusiv in RON");
    }
}
