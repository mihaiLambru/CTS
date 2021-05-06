package ro.ase.cts.Strategy;

public class Client {
    private IPlata tipPlata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        this.tipPlata= new PlataCard();
    }

    public IPlata getTipPlata() {
        return tipPlata;
    }

    public void setTipPlata(IPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public String getNume() {
        return nume;
    }

    public void plateste(float suma){
        this.tipPlata.plateste((suma));
    }
}
