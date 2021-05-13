package ro.ase.cts.builder;

public class FacturaBuilder implements  IBuilder {

    private Factura factura;

    public FacturaBuilder() {
        this.factura=new Factura(0,false,false,0);
    }

    public FacturaBuilder setNumarPungi(int numarPungi){
        factura.setNumarPungi(numarPungi);
        return this;
    }

    public FacturaBuilder setPlataCuCard(boolean plataCuCard) {
        factura.setPlataCuCard(plataCuCard);
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
        factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public FacturaBuilder setCotaTVA(float cotaTVA) {
        factura.setCotaTVA(cotaTVA);
        return this;
    }

    @Override
    public Factura build() {
        return factura;
    }
}
