package ro.ase.cts.Command;

public class main {
    public static void main(String[] args){
        Masa masa = new Masa(1);
        Masa masa2 = new Masa(2);

        Comanda comandaRezervare = new ComandaRezervare(masa);
        Comanda comandaOcupare = new ComandaOcupare(masa2);
        Comanda comandaOcupare1 = new ComandaOcupare(masa);

        Operator operator  = new Operator();
        operator.invoca(comandaOcupare);
        operator.executaComanda();
        operator.invoca(comandaRezervare);
        operator.invoca(comandaOcupare1);

        operator.executaComanda();
        operator.executaComanda();

    }
}
