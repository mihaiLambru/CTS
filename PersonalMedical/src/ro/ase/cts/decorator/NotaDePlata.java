package ro.ase.cts.decorator;

public class NotaDePlata implements INota{
    private int sumaDePlata;

    public NotaDePlata(int sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    @Override
    public void printeaza() {
        System.out.println("S-a printat suma de plata cu suma "+ sumaDePlata);
    }
}
