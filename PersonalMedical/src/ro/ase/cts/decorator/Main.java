package ro.ase.cts.decorator;

public class Main {
    public static void main(String[] args){
        INota nota = new NotaDePlata(250);

        DecoratorAbstract decorator = new DecoratorCuLaMultiAni(nota);
        decorator.printeaza();
        decorator.printeazaFelicitare();

    }
}
