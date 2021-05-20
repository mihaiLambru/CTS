package cts.lambru.mihai.gr1081.state;

public class Avizare implements IStare{
    @Override
    public void modificaStare(CerereStudent cerereStudent) {
        if(cerereStudent.getNrZile() < 10 && isStareConfirmata(cerereStudent)){
            System.out.println("Cererea a fost trecuta in curs de avizare");
            cerereStudent.setStare(this);
        }else {
            System.out.println("Cererea are mai mult de 10 zile, cerere respinsa");
            cerereStudent.setStare(new Respinsa());
        }
    }

    private boolean isStareConfirmata(CerereStudent cerereStudent) {
        return cerereStudent.getStare() instanceof Verificare;
    }
}
