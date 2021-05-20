package cts.lambru.mihai.gr1081.singletone;

public class Robot implements IRobotSoftware {

    private int idRobot;
    private static Robot instance = null;
    private Robot(int idRobot) {
        this.idRobot = idRobot;
    }
    public static synchronized Robot getInstance(int id){
        if(instance == null){
            instance=new Robot(id);
            return instance;
        }
        else return instance;
    }
    @Override
    public void trimiteCerere(String denumire) {
        System.out.println("Robotul a trimis cererea: "+denumire);
    }

    @Override
    public String getInformatii(String categorie) {
        if(categorie.equalsIgnoreCase("Academic")){
            return "Examenele si cursurile vor fi sustinute online";
        }
        if(categorie.equalsIgnoreCase("Documente")){
            return "Cererile pentru documente pot fi depuse online";
        }
        return "Categorie inexistenta";
    }

    @Override
    public void prelucrareCerere(String tip) {
        System.out.println("Robotul va prelucra cererea: "+tip);
    }

    @Override
    public int getIdRobot() {
        return idRobot;
    }
}
