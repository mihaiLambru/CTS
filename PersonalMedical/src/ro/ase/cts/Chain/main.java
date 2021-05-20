package ro.ase.cts.Chain;

public  class main {
    public static void main(String[] args){
        Client client = new Client("Mihai","0722464155","mihai@mihai.com");
        Client client2 = new Client("George",null,"daniel@mihai.com");
        Client client3 = new Client("Daniel","0725664155",null);
        Client client4 = new Client("Daniel",null,null);

        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorSMS = new NotificatorSMS();

        notificatorSMS.setNotificator(notificatorEmail);

        notificatorSMS.trimitereNotificare(client4,"Notificare Test");

    }
}
