package ro.ase.cts.singletone;

import java.util.UUID;

public class GeneratorCod {
    private int index;
    private String cod;

    private static GeneratorCod instance = null;

    private GeneratorCod(int index, String cod) {
        this.index = index;
        this.cod = cod;
    }

    public static synchronized GeneratorCod getInstance(){
        if(instance == null){
            instance = new GeneratorCod(-1,"dsaasd");
        }
        return instance;
    }
    public String genereaza(){
        index++;
        return cod+index;
    }
}
