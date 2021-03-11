package ro.ase.cts.program;
import ro.ase.cts.clase.*;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	private static List<Aplicant> citesteAplicanti(IReader readAplicanti) throws FileNotFoundException {
		return readAplicanti.readAplicanti();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata pentru angajati: "+ Angajat.getStaticSumaFinantare());
		System.out.println("Suma finantata pentru studenti: "+ Student.getStaticSumaFinantare());
		System.out.println("Suma finantata pentru elevi: "+ Elev.getStaticSumaFinantare());

		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect=new Proiect(81);
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantare());

				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
