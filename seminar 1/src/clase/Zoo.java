package clase;

import java.util.ArrayList;
import  java.util.List;

public class Zoo implements ZooInterface {
	private Zookeeper zookeeper;
	private List<Animal> animalList;
	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	public Zoo() {
		super();
		this.zookeeper=new Zookeeper("Ion");
		this.animalList=new ArrayList<Animal>();
	}
	
	public void AdaugareAnimal(Animal animal) {
		animalList.add(animal);
	}
	public void FeedAllAnimals() {
		for(Animal animal:animalList) {
			zookeeper.feed(animal);
		}
	}
}
