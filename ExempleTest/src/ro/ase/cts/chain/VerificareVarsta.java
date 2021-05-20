package ro.ase.cts.chain;

public class VerificareVarsta extends EtapaAbstract{
    @Override
    public void executaEtapa(Client client) {
        if(client.getVarsta() >= 21 && client.getVarsta() <= 60){
            super.getUrmatoareaEtapa().executaEtapa(client);
        }
        else{
            System.out.println("Clientul "+ client.getNume()+" nu a primit creditul");
            EtapaAbstract salvareDate = new SalvareDate();
            salvareDate.executaEtapa(client);
        }
    }
}
