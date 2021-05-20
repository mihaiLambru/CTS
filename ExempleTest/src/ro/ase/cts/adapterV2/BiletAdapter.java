package ro.ase.cts.adapterV2;

public class BiletAdapter extends Bilet implements IeBilet{
    public BiletAdapter(String numeDetinator) {
        super(numeDetinator);
    }

    @Override
    public void vindeBilet(Bilet bilet) {
        System.out.println("A fost vandut biletul persoanei: "+super.getNumeDetinator());
    }
}
