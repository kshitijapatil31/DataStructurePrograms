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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Dequeue<T> getNext() {
		return next;
	}

	public void setNext(Dequeue<T> next) {
		this.next = next;
	}

	public Dequeue<T> getPrev() {
		return prev;
	}

	public void setPrev(Dequeue<T> prev) {
		this.prev = prev;
	}
	
}
