package prob4;

public class MyStack implements Stack {

	private int size;
	private int top;
	private String[] buffer;
	
	public MyStack(int size) {
		resize(size);
	}
	private void resize(int size) {
		String[] tempBuffer = new String[size];
		for (int i = 0; i < top; i++) {
			tempBuffer[i] = buffer[i];
		}
		buffer = tempBuffer;
		this.size = size;
	}
	@Override
	public void push(String item) {

		if (top == size) {
			resize(size * 2);
		}
		buffer[top++] = item;
	}
	@Override
	public String pop() throws MyStackException {
		if(top == 0){
			throw new MyStackException("stack is empty");
		}
		return buffer[--top];
	}
	@Override
	public boolean isEmpty() {
		return top == 0;
	}
	@Override
	public int size() {
		return top;
	}
}
