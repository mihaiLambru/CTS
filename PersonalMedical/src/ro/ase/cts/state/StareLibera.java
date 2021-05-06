package ro.ase.cts.state;

public class StareLibera implements IStare{

    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof  StareLibera)){
            System.out.println("Nu putem face aceasta modificare!");
        }
        else{
            masa.setStare(this);
            System.out.println("Masa cu numarul "+masa.getNumar() + " a fost eliberata");
        }
    }
}
