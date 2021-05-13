package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> mementoList;

    public ManagerMemento(List<Memento> mementoList) {
        this.mementoList = mementoList;
    }

    public ManagerMemento() {
        this.mementoList=new ArrayList<>();
    }
    public void adaugareMemento(Memento memento){
        this.mementoList.add(memento);
    }
    public Memento cereUnMemento(int index){
        if(index>=0&& index<= mementoList.size()){
            return mementoList.get(index);
        }
        return null;
    }
    public Memento getLastMemento(){
        return mementoList.get(mementoList.size()-1);
    }
}
