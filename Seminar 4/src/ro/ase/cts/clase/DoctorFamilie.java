package ro.ase.cts.clase;

public class DoctorFamilie {
    private String nume;
    private int varsta;
    private boolean isActiv;

    private DoctorFamilie(String nume, int varsta, boolean isActiv) {
        this.nume = nume;
        this.varsta = varsta;
        this.isActiv = isActiv;
    }


    private static  DoctorFamilie instance = null;

    public static synchronized  DoctorFamilie getInstance(String nume, int varsta, boolean isActiv){
        if(instance == null){
            instance = new DoctorFamilie(nume, varsta, isActiv);
        }

        return instance;
    }
    public static synchronized  DoctorFamilie getInstance(){
        return instance = DoctorFamilie.getInstance("Necunoscu",0,false);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DoctorFamilie{");
        sb.append("Nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", isActiv=").append(isActiv);
        sb.append('}');
        return sb.toString();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setActiv(boolean activ) {
        isActiv = activ;
    }
}
