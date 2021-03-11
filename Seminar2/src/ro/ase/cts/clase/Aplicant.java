package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumiriProiecte;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareRaspunsProiect(Proiect proiect){

		boolean isAcceptat = punctaj >= proiect.getPragDeAcceptare();

		StringBuilder builder = new StringBuilder("Aplicantul ");
		builder.append(nume).append(" ");
		builder.append(prenume).append(" ");
		builder.append(isAcceptat ? "a fost acceptat" : "a fost respins");

		System.out.println(builder.toString());

	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumiriProiecte;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}

	public void setVectorDenumiri(String[] denumiriProiecte, int nr_proiecte){
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumiriProiecte;

	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("");
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nr_proiecte=").append(nr_proiecte);
		sb.append(", denumiriProiecte=").append(Arrays.toString(denumiriProiecte));
		return sb.toString();
	}

	public abstract float getSumaFinantare();
}
