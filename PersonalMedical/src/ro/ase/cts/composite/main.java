package ro.ase.cts.composite;

public class main {
    public static void main(String[] args){
        Agentia agentia1 = new Agentia();
        Agentia agentia2 = new Agentia();
        Agentia agentia3 = new Agentia();

        Filiala filiala1 = new Filiala("Calea a");
        Filiala filiala2 = new Filiala("Calea b");
        Filiala filiala3 = new Filiala("Calea c");
        Filiala filiala4 = new Filiala("Calea d");

        agentia1.addNou(filiala1);
        agentia1.addNou(filiala2);
        agentia2.addNou(filiala3);
        agentia3.addNou(filiala4);

        agentia1.addNou((agentia3));

        agentia1.afiseazaDescriere();
        agentia2.afiseazaDescriere();
    }
}
