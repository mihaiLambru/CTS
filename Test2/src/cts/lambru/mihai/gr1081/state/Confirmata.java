package cts.lambru.mihai.gr1081.state;

public class Confirmata implements IStare{

    @Override
    public void modificaStare(CerereStudent cerereStudent) {
        boolean isMotivNull = cerereStudent.getMotiv() == null;
        if(cerereStudent.getNrZile() < 10 || isMotivNull) {
            System.out.println("Cerere primita");
            cerereStudent.setStare(this);
        } else {
            System.out.println("Cerere respinsa");
            cerereStudent.setStare(new Respinsa());
        }
    }


}
