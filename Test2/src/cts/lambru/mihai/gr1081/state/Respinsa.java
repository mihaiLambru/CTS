package cts.lambru.mihai.gr1081.state;

public class Respinsa implements IStare{
    @Override
    public void modificaStare(CerereStudent cerereStudent) {
            System.out.println("Cererea a fost respinsa");
            cerereStudent.setStare(this);

    }
}
