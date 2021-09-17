package stack.ofemp;

public interface Stack {

	int STACK_SIZE = 2;
	//creating push method with Employee type argument
	void push(Employee emp);
	//pop method with return type Employee
	Employee pop();

}

