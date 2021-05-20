package cts.lambru.mihai.gr1081.command;

import java.util.List;

public class Operator {
    List<Cerere> cerereList;

    public Operator(List<Cerere> cerereList) {
        this.cerereList = cerereList;
    }
    public void adaugareCerere(Cerere cerere){
        cerereList.add(cerere);
    }
}
