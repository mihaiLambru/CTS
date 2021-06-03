package ro.ase.cts.teste2.teste.mockuri;

import org.junit.Test;
import ro.ase.cts.teste2.clase.Grupa;
import ro.ase.cts.teste2.clase.IStudent;
import ro.ase.cts.teste2.clase.Student;

import static org.junit.Assert.*;

public class DummyStudentTest {
    @Test
    public void testAdaugaStudent(){
        IStudent student = new DummyStudent();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals("Adaugare",1,grupa.getStudenti().size());
    }

}