public class Queue {
	private int[] queue;
	int top;
	int elementsNumber;
	public Queue(int elementsNumber) {
		queue = new int[elementsNumber];
		this.elementsNumber = elementsNumber;
		top = -1;
	}

	public void push(int element) {
		if (top < elementsNumber - 1) {
			for (int i = top; i >= 0; i--)
				queue[i + 1] = queue[i];
			queue[0] = element;
			top++;
		}
		else throw new ArrayIndexOutOfBoundsException("Overflow");
	}

	public int pop() {
		if (top > -1) {
			return queue[top--];
		}
		else throw new ArrayIndexOutOfBoundsException("Underflow");
	}
}
