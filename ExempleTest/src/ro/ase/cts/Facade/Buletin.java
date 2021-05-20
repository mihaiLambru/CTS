package ro.ase.cts.Facade;

public class Buletin {
    private String nume;

    public Buletin(String nume) {
        this.nume = nume;
    }

    public boolean boolean verificareBuletin(Bilet bilet){
        if(nume == bilet.getNumePers()){
            return true;
        }
        else return false;
    }
}
