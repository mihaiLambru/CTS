package ro.ase.cts.proxy;

public class Main {
    public static void main (String[] args){
        OperatorCredite op = new OperatorCredite();
        op.creareCredit(2000,Moneda.EUR);

        OperatorCrediteProxy proxy = new OperatorCrediteProxy(op);
        proxy.creareCredit(2000,Moneda.EUR);
        proxy.creareCredit(2000,Moneda.RON);

    }
}
