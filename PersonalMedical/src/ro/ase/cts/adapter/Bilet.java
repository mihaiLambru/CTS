package ro.ase.cts.adapter;

public class Bilet {
    private float pret;

    public Bilet(float pret) {
        this.pret = pret;
    }
    public void vanzare(){
        System.out.println("S-a vandut un bilet la pretul: "+ pret);
    }
    public void rezercare(){
        System.out.println("S-a rezervat un bilet la pretul: "+ pret);
    }
}
