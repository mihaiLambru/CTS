package cts.lambru.mihai.gr1081.state;


public class CerereStudent implements ICerereStudent {

    private IStare stare;

    private Integer nrZile;

    private String motiv;

    public CerereStudent(Integer nrZile,String motiv) {
        this.nrZile = nrZile;
        this.motiv = motiv;
    }

    @Override
    public void confirmare() {
        Confirmata confirmata = new Confirmata();
        confirmata.modificaStare(this);
    }

    @Override
    public void verificare() {
        Verificare stareVerificare = new Verificare();
        stareVerificare.modificaStare(this);
    }

    @Override
    public void avizareDecanat() {
        Avizare avizare = new Avizare();
        avizare.modificaStare(this);
    }

    @Override
    public void respingere() {
        Respinsa respinsa = new Respinsa();
        respinsa.modificaStare(this);
    }

    public Integer getNrZile() {
        return nrZile;
    }

    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }
}
