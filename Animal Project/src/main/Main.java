package main;



import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.bird.Eagle;
import animal.fish.Eel;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

public class Main {
	
	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		
		
		Animal animal = new Animal(); 
		//System.out.println(animal.showInfo());
		
		
		Animal reptile =  new Reptile();
		//System.out.println(reptile.showInfo());
		
		
		Animal croc = new Crocodile();
		//System.out.println(croc.showInfo());
		
		Animal eel = new Eel();
		//System.out.println(eel.showInfo());
		
		Animal eagle = new Eagle();
		//System.out.println(eagle.showInfo());
		
		
		animals.add(animal);
		animals.add(reptile);
		animals.add(croc);
		animals.add(eel);
		animals.add(eagle);
		
		listAnimals(animals);
	}
	
	
	public static void listAnimals(List<Animal> animals) {
		for(Animal animal: animals) {
			System.out.println(animal.showInfo());
		}
	}
}
