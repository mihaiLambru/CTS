package ro.ase.cts.state;

public class StareRezervata implements IStare{

    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("Masa cu numarul "+ masa.getNumar() + " este rezervata cu succes! ");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa cu numarul "+ masa.getNumar() + " nu poate fi rezervata.");

        }
    }
}
