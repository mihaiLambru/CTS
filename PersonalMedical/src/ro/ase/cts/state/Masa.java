package ro.ase.cts.state;

public class Masa {
    private IStare stare;
    private int numar;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = new StareLibera();
    }

    public IStare getStare() {
        return stare;
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    private IStare modificareStare(IStare stare){
        stare.modificaStare(this);
        return stare;
    }

    public void rezervareMasa(){
        StareRezervata rezervata = new StareRezervata();
        rezervata.modificaStare(this);
    }
    public void ocupareMasa(){
        StareOcupata ocupata = new StareOcupata();
        ocupata.modificaStare(this);
    }
    public void eliberareMasa(){
        StareLibera libera = (StareLibera) this.modificareStare(new StareLibera());
    }
}
