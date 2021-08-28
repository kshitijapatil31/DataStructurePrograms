package com.bridgelabz.datastructureprograms;

public class Dequeue<T> {

	T data;
	Dequeue <T>next;
	Dequeue <T>prev;

	public Dequeue(T data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	
}
