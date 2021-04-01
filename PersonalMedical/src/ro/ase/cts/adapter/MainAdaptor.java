package ro.ase.cts.adapter;

public class MainAdaptor {
    private static void rezervaSiAfiseaaBiletLaCasa(Bilet bilet){
        bilet.rezercare();
        bilet.vanzare();
    }
    private static void rezeraSiAfiseazaBiletOnline(IBiletOnline bilet){
        bilet.rezervaBiletOnline();
        bilet.vindeBiletOnline();
    }
    public static void main(String[] args) {
        Bilet bilet = new Bilet(30f);
        rezervaSiAfiseaaBiletLaCasa((bilet));

    }
}
