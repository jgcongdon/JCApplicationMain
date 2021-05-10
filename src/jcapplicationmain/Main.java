package jcapplicationmain;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // Create Dog objects
       Dog dog = new Dog("Doberman", "Alert", 13, 500.0);
       Cat cat = new Cat("Ragdoll", "Calm", 19, 1500.0);
       //Animal dog2 = new Animal(null, null, 0, 0.0);
       Animal dog2 = new Dog("Bulldog",)

       //dog.setBreed("Doberman");
       //cat.setBreed("Ragdoll");

       System.out.println(dog.getBreed());
       System.out.println(dog.getBehavior());
       System.out.println(dog.getLifespan());
       System.out.println(dog.getPrice());
       System.out.println(dog.getSound());

       System.out.println(cat.getBreed());
       System.out.println(cat.getBehavior());
       System.out.println(cat.getLifespan());
       System.out.println(cat.getPrice());
       System.out.println(cat.getSound());

    }

}
