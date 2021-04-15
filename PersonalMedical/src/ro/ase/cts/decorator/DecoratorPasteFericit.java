package ro.ase.cts.decorator;

public class DecoratorPasteFericit extends DecoratorAbstract{
    public DecoratorPasteFericit(INota nota) {
        super(nota);
    }
    @Override
    public void printeazaFelicitare(){
        System.out.println("Felicitare: Paste fericit!");
    }
}
