package ro.ase.cts.chain;

public abstract class EtapaAbstract {
    private EtapaAbstract urmatoareaEtapa;


    public void setUrmatoareaEtapa(EtapaAbstract urmatoareaEtapa) {
        this.urmatoareaEtapa = urmatoareaEtapa;
    }

    public EtapaAbstract getUrmatoareaEtapa() {
        return urmatoareaEtapa;
    }

    public abstract void executaEtapa(Client client);
}
