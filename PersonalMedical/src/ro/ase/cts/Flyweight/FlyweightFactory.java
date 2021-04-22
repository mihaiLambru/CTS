package ro.ase.cts.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IFlyweight> factory;

    public FlyweightFactory(){
        this.factory = new HashMap<>();
    }

    public IFlyweight getFlyweight(String nrTelefon){
        if(!factory.containsKey(nrTelefon)){
            Client client = new Client("-",nrTelefon,"-");
            factory.put(nrTelefon,client);
        }
        return factory.get(nrTelefon);

    }
}
