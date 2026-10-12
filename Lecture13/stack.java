package Lecture13;

public class stack {
	int[] st = new int[5];

	int top = -1;
	int size = 0;

	public int Size() {
		return size;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == st.length - 1) {
			return true;
		}
		return false;
	}

	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}
		top = top + 1;
		st[top] = val;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int val = st[top];
		top--;
		size--;
		return val;
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return st[top];
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}
		for (int i = top; i >= 0; i--) {
			System.out.println(st[i]);
		}
	}

	public static void main(String[] args) {
		stack st = new stack();
//		System.out.println(st.isEmpty());
//		st.push(10);
//		st.push(20);
//		st.push(30);
// 		st.push(40);
//		st.push(50);
//		st.display();
		System.out.println("---");
		System.out.println(st.pop());
		System.out.println("---");

	}

}
