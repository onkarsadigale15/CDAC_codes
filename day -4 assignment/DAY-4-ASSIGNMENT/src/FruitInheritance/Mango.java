package FruitInheritance;

public class Mango extends Fruit {

	public Mango(String name) {
		super(name);

	}

	public String taste() {
		return "Fruit Mango Name is " + super.getName() + " ,which is Sweet in taste";

	}

}