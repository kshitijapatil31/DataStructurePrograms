package com.bridgelabz.datastructureprograms;



public class MyStackNode<T> {

	T key;
	MyStackNode next;
	public T value;
	
	public MyStackNode(T key) {
		
		this.key = key;
		this.next = null;
	}

	public T getKey() {
		
		return key;
	}
	
}
