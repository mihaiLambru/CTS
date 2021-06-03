package ro.ase.cts.teste2.teste.mockuri;

import ro.ase.cts.teste2.clase.IStudent;

import java.util.List;

public class StubStudent implements IStudent {
    @Override
    public String getNume() {
        return "Gigel";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 6.7f;
    }

    @Override
    public int getNota(int index) {
        return 8;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
