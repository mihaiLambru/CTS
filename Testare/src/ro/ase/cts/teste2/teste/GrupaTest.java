package ro.ase.cts.teste2.teste;

import org.junit.Test;
import ro.ase.cts.teste2.clase.Grupa;
import ro.ase.cts.teste2.clase.IStudent;
import ro.ase.cts.teste2.clase.Student;

import java.security.PrivilegedActionException;

import static org.junit.Assert.*;

public class GrupaTest {
    @Test
    public void testConstructorNumarGrupaCorect(){
        Grupa grupa = new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());
    }
    @Test
    public void testConstructor(){
        Grupa grupa = new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    public void testConstructorLimitaInferioara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }
    @Test
    public void testConstructorLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptieConstructor(){
        Grupa grupa = new Grupa(900);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptieConstructorSuperior(){
        Grupa grupa = new Grupa(1200);
    }
    @Test(timeout = 500)
    public void testPerformantaConstructor(){
        Grupa grupa = new Grupa(1081);
    }
    @Test
    public void testePromovabilitateRight(){
        Grupa grupa = new Grupa(1081);
        for (int i=0;i<10;i++){
            IStudent student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        for (int i=0;i<5;i++){
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.66f,grupa.getPromovabilitate(),0.1);
    }

    @Test
    public void testGetPromovabilitateListaInf(){
        Grupa grupa = new Grupa(1001);
        for (int i=0;i<10;i++){
            IStudent student = new Student();
            student.adaugaNota(4);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        assertEquals(0,grupa.getPromovabilitate(),0.1);
    }
    @Test
    public void testGetPromovabilitateListaSup(){
        Grupa grupa = new Grupa(1081);
        for (int i=0;i<10;i++){
            IStudent student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        assertEquals(1,grupa.getPromovabilitate(),0.1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetPromovabilitateErrorCondition(){
        Grupa grupa = new Grupa(1001);
        grupa.getPromovabilitate();
    }
    @Test(timeout = 500)
    public void testPromovabilitatePerformance(){
        Grupa grupa = new Grupa(1081);
        for (int i=0;i<10;i++){
            IStudent student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }
        assertEquals(1,grupa.getPromovabilitate(),0.1);
    }
}