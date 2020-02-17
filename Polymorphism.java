package app.demo;

/*Program -2 There is an animal class which has the common characteristics of all animals. Dog, Horse, Cat are animals(sub-class). 
Each can shout, but each shout is different. Use polymorphism to create objects of same and using an animal variable, 
make each of the animals shout
*/

class Animal {
	public void shout() {
		System.out.println("The animal is shouting");
	}
}

class Dog extends Animal {
	public void shout() {
		System.out.println("The animal is barking");
	}
}

class Horse extends Animal {
	public void shout() {
		System.out.println("The animal is neighing");
	}
}

class Cat extends Animal {
	public void shout() {
		System.out.println("The animal is mewing");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		animal1.shout();
		Animal animal2 = new Horse();
		animal2.shout();
		Animal animal3 = new Cat();
		animal3.shout();
	}
}
