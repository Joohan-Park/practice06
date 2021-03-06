package prob6;

public class MainApp {

	public static void main(String[] args) {
		try {
			Stack<String> stack = new MyStack<String>(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (!stack.isEmpty()) {
				System.out.println(stack.pop());
			}

			System.out.println("======================================");

			stack = new MyStack<String>(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} catch (MyStackException ex) {
			System.out.println( ex );
		}
	}
}
