package com.bridgelabz.datastructureprograms;

import com.bridgelabz.datastructureprograms.MyStackNode;

public class StackOperation<T> {

	MyStackNode top;

	public void push(T key) {

		MyStackNode temp = new MyStackNode(key);

		if (isEmpty()) {
			top = temp;

		} else {
			temp.next = top;
			top = temp;
		}

	}

	public int pop() {
		int value = 0;
		if (!isEmpty()) {
			top = top.next;
			// value=top.key;
		}
		return value;
	}

	public T peek() {
		return (T) top.value;
	}

	public boolean isEmpty() {
		return (top == null) ? true : false;
	}

	public String toString() {
		MyStackNode current = top;
		StringBuilder s = new StringBuilder();

		while (current != null) {
			s.append(current.key + "  ");
			current = current.next;
		}

		return s.toString();
	}

}
