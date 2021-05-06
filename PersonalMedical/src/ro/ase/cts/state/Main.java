package ro.ase.cts.state;

public class Main {
    public static void main(String[] args){
        Masa masa1 = new Masa(10);

        masa1.eliberareMasa();;
        masa1.rezervareMasa();
        masa1.setStare(new StareLibera());
        masa1.rezervareMasa();
        masa1.ocupareMasa();
    }
}
