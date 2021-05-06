package ro.ase.cts.Chain;

public abstract class Notificator {
    private Notificator notificator;

    public void setNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    public Notificator getNotificator() {
        return notificator;
    }

    public abstract void trimitereNotificare(Client client, String text);
}
