package ro.ase.cts.memento;

public class Memento {
    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;



    public Memento(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }

    public Memento creazaMemento(){
        Memento memento = new Memento(nrSpectatori,numeEchipaGazda,numeEchipaOaspeti);
        return memento;
    }
    public void seteazaMemento(Memento memento){
        this.nrSpectatori = memento.getNrSpectatori();
        //mai era cod aici
    }
}
