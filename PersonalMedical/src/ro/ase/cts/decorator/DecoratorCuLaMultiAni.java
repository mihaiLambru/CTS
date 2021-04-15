package ro.ase.cts.decorator;

public class DecoratorCuLaMultiAni extends DecoratorAbstract {
    public DecoratorCuLaMultiAni(INota nota) {
        super(nota);
    }
    @Override
    public void printeazaFelicitare(){
        System.out.println("Felicitare: La multi ani");
    }
}
