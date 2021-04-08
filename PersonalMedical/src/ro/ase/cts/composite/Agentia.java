package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Agentia implements ISediu{
    private List<ISediu> sedii;

    public Agentia(){
        sedii = new ArrayList<ISediu>();

    }
    @Override
    public void afiseazaDescriere() {
        System.out.println("Este o agentie.");
        for (var sediu: sedii) {
           sediu.afiseazaDescriere();
        }
    }

    @Override
    public void addNou(ISediu sediu) {
        sedii.add(sediu);
    }

    @Override
    public void removeNode(ISediu sediu) {
        sedii.remove(sediu);
    }

    @Override
    public ISediu getNode(int position) {
        return sedii.get(position);
    }
}
