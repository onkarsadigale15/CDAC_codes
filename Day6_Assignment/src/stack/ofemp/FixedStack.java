package stack.ofemp;

public class FixedStack implements Stack {
	private int top=-1;
	private Employee[] stack = new Employee[STACK_SIZE];
	
	
	@Override
	public void push(Employee emp) {
		// TODO Auto-generated method stub
		if(top!=STACK_SIZE-1) //check whether the stack is not FULL
		{
			stack[++top]=emp;
			//stack[0]=emp
			//stack[1]=emp  stack size is 2..so only 2 obj will store
		}
		else
			System.out.println("Stack_Overflow..!!");
		
	}
	@Override
	public Employee pop() {
		// TODO Auto-generated method stub
		if (top!=-1)//check whether the stack is not empty
		{
			Employee emp = stack[top];
			stack[top--] = null;//making topmost value of stack as NULL
			return emp;	//returning popped emp data to display as popped
		}
		return null;
		
	}
	
	
}
