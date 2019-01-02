import java.util.Stack;

public class Test {
	static void push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	static void pop(Stack<Integer> stack) {
		System.out.println("pop :");
		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	static void peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top : " + element);
	}

	static void search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position " + pos);
	}

	public static void main (String[] args) 
    { 
        Stack<Integer> stack = new Stack<Integer>();      
        
        push(stack); 
        pop(stack); 
        push(stack); 
        peek(stack); 
        search(stack, 2); 
        search(stack, 6); 
    }

}
