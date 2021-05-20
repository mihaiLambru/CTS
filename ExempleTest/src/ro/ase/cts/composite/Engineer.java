package ro.ase.cts.composite;

import java.util.List;

public class Engineer  implements IMechanic{
    List<Mechanic> mechanicList;

    @Override
    public void afiseazaDescriere() {
        System.out.println("Inginerul are in subordine: ");
        for(Mechanic mechanic : mechanicList){
            mechanic.afiseazaDescriere();
        }
    }

    @Override
    public void add(IMechanic mecanic) {

    }

    @Override
    public void remove(IMechanic mecanic) {

    }

    @Override
    public void getChild(IMechanic mecanic) {

    }
}
