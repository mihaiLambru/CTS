package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class IReader {
    protected String numeFisier;

    public IReader(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException;
}
