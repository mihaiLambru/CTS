package ro.ase.cts.teste2.teste.mockuri;

import org.junit.Test;
import ro.ase.cts.teste2.clase.Grupa;
import ro.ase.cts.teste2.clase.IStudent;
import ro.ase.cts.teste2.clase.Student;

import static org.junit.Assert.*;

public class StubStudentTest {
    @Test
    public void testGetPromovabilitate(){
        IStudent student = new StubStudent();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);

        assertEquals(1, grupa.getPromovabilitate(),0.001);
    }

    @Test
    public void testPromovabilitateFakeStudent(){
        Grupa grupa = new Grupa(1081);
        for(int i = 0;i<8;i++){
            FakeStudent student = new FakeStudent();
            student.setAreRestante(false);
            grupa.adaugaStudent(student);
        }
        for(int i = 0;i<2;i++){
            FakeStudent student = new FakeStudent();
            student.setAreRestante(true);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.8f,grupa.getPromovabilitate(),0.01);
    }

}