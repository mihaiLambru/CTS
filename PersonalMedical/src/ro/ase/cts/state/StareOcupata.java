package ro.ase.cts.state;

public class StareOcupata implements IStare{

    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)){
            System.out.println("Masa cu numarul "+ masa.getNumar() + " poate fi ocupata!");
        }
        else{
            System.out.println("Masa cu numarul "+ masa.getNumar() + " NU poate fi ocuoata! ");
        }
    }
}
