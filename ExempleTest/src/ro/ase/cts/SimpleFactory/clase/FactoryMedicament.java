package ro.ase.cts.SimpleFactory.clase;

public class FactoryMedicament {
    public Medicament creareMedicament(CategorieMedicamente categorieMedicamente, int pret, String denumire){
        switch (categorieMedicamente){
            case Body: return new MedicamentBody(pret, denumire);
            case Durere: return new MedicamentDurere(pret, denumire);
            case Raceala: return new MedicamentRaceala(pret, denumire);
            default: throw new IllegalArgumentException();
        }
    }
}
