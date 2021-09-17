package stack.ofemp;

public class GrowableStack implements Stack {
	private Employee[] stack = new Employee[STACK_SIZE];
	private int top = -1;
	public static int b=2;//for incrementing array size

	@Override
	public void push(Employee emp) {
		if (top!=STACK_SIZE-1) //check whether the stack is not FULL
			stack[++top] = emp;
		else { // Upon stack full
			Employee[] temp = stack;//copy the stack data in to temp
			stack = new Employee[stack.length*b];
			for (int i=0; i<=top; i++)
				stack[i] = temp[i];//storing temp values into the new array stack
			stack[++top] = emp;//add new employee data in to stack
			
		}
		b+=2;
	}

	@Override
	public Employee pop() {
		if (top!=-1) {//check whether the stack is not empty
			Employee emp = stack[top];//saving currunt value of top in emp and return it
			stack[top--] = null;//making topmost value of stack as NULL
			return emp;	
		}
		return null;
	}
}
