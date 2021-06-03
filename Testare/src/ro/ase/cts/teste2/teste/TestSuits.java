package ro.ase.cts.teste2.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.teste2.teste.mockuri.DummyStudentTest;
import ro.ase.cts.teste2.teste.mockuri.StubStudentTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        GrupaTest.class,
        DummyStudentTest.class,
        StubStudentTest.class
})
public class TestSuits {
}
