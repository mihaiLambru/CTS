package ro.ase.cts.composite;

public class Filiala implements ISediu{
    private String numeFiliala;

    public Filiala(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Filiala: " + numeFiliala);
    }

    @Override
    public void addNou(ISediu sediu) throws Exception {
        throw new Exception("Nu este implementat");
    }

    @Override
    public void removeNode(ISediu sediu) throws Exception {
        throw new Exception("Nu este implementat");
    }

    @Override
    public ISediu getNode(int position) throws Exception {
        throw new Exception("Nu este implementat");
    }
}
