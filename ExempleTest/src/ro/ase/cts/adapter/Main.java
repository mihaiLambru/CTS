package ro.ase.cts.adapter;

public class Main {
    public static void main(String[] args){
        Medicament med1 = new Medicament(1,22);
        Medicament med2 = new Medicament(2,1);

        AdapterAplicatii adapter = new AdapterAplicatii(med1);
        System.out.println(adapter.verificaStocPentruMedicament(1,2));
    }
}
