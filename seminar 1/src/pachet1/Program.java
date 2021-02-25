package pachet1;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo zoo = new Zoo();
		Girafa g1 = new Girafa("g1");
		Girafa g2 = new Girafa("g2");
		
		zoo.AdaugareAnimal(g1);
		zoo.AdaugareAnimal(g2);
		
		Zebra z1 = new Zebra("g1",2);
		Zebra z2 = new Zebra("g2",1);
		
		zoo.AdaugareAnimal(z1);
		zoo.AdaugareAnimal(z2);
		
		zoo.FeedAllAnimals();
	}

}
