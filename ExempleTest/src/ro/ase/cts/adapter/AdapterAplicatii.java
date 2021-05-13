package ro.ase.cts.adapter;

public class AdapterAplicatii extends AplicatieVanzare implements GestiuneMedicamente{
    public AdapterAplicatii(Medicament medicament) {
        super(medicament);
    }

    @Override
    public boolean verificaStocPentruMedicament(int id, int nr) {
        super.setareMedicament(id);
        System.out.println("Verificare stoc pentru medicament: ");
        return super.verificareDisponibulitate(nr);
    }
}
