package ro.ase.cts.adapter;

import com.sun.tools.jconsole.JConsoleContext;

public class AplicatieVanzare implements IVanzare{

    private Medicament medicament;

    public AplicatieVanzare(Medicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public void setareMedicament(int id) {
        this.medicament=new Medicament(id);
        System.out.println("Adaugare medicament cu id="+id+" in cosul de cumparaturi.");
    }

    @Override
    public boolean verificareDisponibulitate(int numarMedicamente) {
        System.out.println("Verificare stoc medicament.");
        if(medicament.getNumar() >= numarMedicamente){
            return true;
        }else return false;
    }
}
