package FruitInheritance;

public class Orange extends Fruit {

	public Orange(String name) {
		super(name);

	}

	public String taste() {
		return "Fruit Orange Name is " + super.getName() + " ,which is Sour in taste";

	}

}