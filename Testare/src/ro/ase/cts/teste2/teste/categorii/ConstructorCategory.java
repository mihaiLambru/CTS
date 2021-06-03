package ro.ase.cts.teste2.teste.categorii;

import jdk.jfr.Category;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.teste2.teste.GrupaTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTest.class,GrupaTest.class})
@Categories.IncludeCategory(ConstructorCategory.class)
public interface ConstructorCategory {
}
