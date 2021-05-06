package ro.ase.cts.Chain;

public class NotificatorEmail extends Notificator{
    @Override
    public void trimitereNotificare(Client client, String text) {
        if(client.getEmail() != null){
            System.out.println("Trimitere email catre "+ client.getNume() + "mesaj: "+text);
        }
        else{
            if(super.getNotificator() != null){
                super.getNotificator().trimitereNotificare(client,text);
            }else{
                System.out.println("Domnule Manager, nu avem date de contact pentru clientul " + client.getNume() );
            }
        }
    }
}
