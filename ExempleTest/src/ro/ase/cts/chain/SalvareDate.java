package ro.ase.cts.chain;

public class SalvareDate extends EtapaAbstract{


    @Override
    public void executaEtapa(Client client) {
        System.out.println("Datele clientului "+ client.getNume()+" au fost salvate cu succes");
    }
}
