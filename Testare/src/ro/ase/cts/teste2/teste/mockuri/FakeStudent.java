package ro.ase.cts.teste2.teste.mockuri;

import ro.ase.cts.teste2.clase.IStudent;

import java.util.ArrayList;
import java.util.List;

public class FakeStudent implements IStudent {
    private String nume;
    private List<Integer> note;
    private float medieCalculata;
    private int nota;
    private boolean areRestante;

    public void setNote(List<Integer> note) {
        this.note = note;
    }

    public void setMedieCalculata(float medieCalculata) {
        this.medieCalculata = medieCalculata;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setAreRestante(boolean areRestante) {
        this.areRestante = areRestante;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume=nume;
    }

    @Override
    public List<Integer> getNote() {
        return note;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return medieCalculata;
    }

    @Override
    public int getNota(int index) {
        return nota;
    }

    @Override
    public boolean areRestante() {
        return areRestante;
    }
}
