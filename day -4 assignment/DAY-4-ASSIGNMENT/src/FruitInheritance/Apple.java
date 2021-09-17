package FruitInheritance;

public class Apple extends Fruit {

	public Apple(String name) {
		super(name);

	}

	public String taste() {
		return "Fruit Apple Name is " + super.getName() + " ,which is Sweet and Sour in taste";

	}

}