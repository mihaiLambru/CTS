package ro.ase.cts.builder;

public class Factura {
    private int NumarPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private float cotaTVA;

    public Factura(int numarPungi, boolean plataCuCard, boolean cardFidelitate, float cotaTVA) {
        NumarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public void setNumarPungi(int numarPungi) {
        NumarPungi = numarPungi;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
    }
}
