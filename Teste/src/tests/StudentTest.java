package tests;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testConstructorCuUnParametru(){
        String nume = "Costica";
        Student student = new Student(nume);

        assertEquals(nume,student.getNume());
        assertNotNull(student.getNote());
    }

    @Test
    public void testConstructorFaraPanametrii(){
        Student student = new Student();

        assertNotNull(student.getNote());
        assertNotNull(student.getNume());
    }

    @Test
    public void testAdaugaNota(){
        Student student = new Student();
        int nota = 5;
        student.adaugaNota(nota);

        assertEquals(nota,student.getNota(0));
    }
    @Test
    public void testAdaugareNotaDimensiune(){
        Student student = new Student();
        student.adaugaNota(2);
        student.adaugaNota(5);
        student.adaugaNota(7);

        assertEquals(3,student.getNote().size());
    }

    @Test
    public void testCalculeazaMedie(){
        Student student = new Student();
        student.adaugaNota(2);
        student.adaugaNota(5);
        student.adaugaNota(7);
        float medie = (float)(2+5+7)/3;

        assertEquals(medie,student.calculeazaMedie(),0.1);
    }
    @Test
    public void testMedieFaraNote(){
        Student student = new Student();

        float medie = 0;

        assertEquals(medie,student.calculeazaMedie(),0.1);
    }
    @Test
    public void testMedieONota(){
        Student student = new Student();
        student.adaugaNota(7);
        float medie = 7;

        assertEquals(medie,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testAreRestanteAdevarat(){
        Student student = new Student();
        student.adaugaNota(2);
        student.adaugaNota(2);
        student.adaugaNota(5);
        student.adaugaNota(7);

        assertTrue(student.areRestante());
    }
    @Test
    public void testAreRestanteFalse(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);

        assertFalse(student.areRestante());
    }
}