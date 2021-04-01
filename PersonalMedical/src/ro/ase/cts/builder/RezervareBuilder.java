package ro.ase.cts.builder;

public class RezervareBuilder implements AbstractBuilder
{
    public RezervareBuilder() {
        this.rezervare = new Rezervare(0,false,false,false, false,"manele");
    }
    private Rezervare rezervare ;
    public RezervareBuilder setCodRezervare(int codRezervare){
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }
    public RezervareBuilder setAreMancare(boolean areMancare){
        this.rezervare.setAreMancare(areMancare);
        return this;
    }
    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic){
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }
    public RezervareBuilder setAreBautura(boolean areBautura){
        this.rezervare.setAreBautura(areBautura);
        return this;
    }
    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala){
        this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica){
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }


    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
