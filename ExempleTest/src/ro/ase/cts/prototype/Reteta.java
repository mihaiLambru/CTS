package ro.ase.cts.prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements PrototypeAbstract{
    private HashMap<String, Float> concentratiiSolutii;

    public Reteta(HashMap<String, Float> concentratiiSolutii) {
        this.concentratiiSolutii = concentratiiSolutii;
    }

    @Override
    public PrototypeAbstract copiaza() {
        HashMap<String,Float> copie =new HashMap<>();
        for (Map.Entry<String,Float> entry:concentratiiSolutii.entrySet()) {
            copie.put(entry.getKey(),entry.getValue());
        }
        Reteta reteta = new Reteta(copie);
        return reteta;
    }
}
