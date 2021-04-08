package ro.ase.cts.composite;

public interface ISediu {
    public void afiseazaDescriere();
    public void addNou(ISediu sediu) throws Exception;
    public void removeNode(ISediu sediu) throws Exception;
    public ISediu getNode(int position) throws Exception;
}
