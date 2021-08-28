package com.bridgelabz.datastructureprograms;

public class MyDequeue <T>{

	Dequeue<T>front ;
	Dequeue<T>rear;
	int size=0;
	
	public void addFront(T c) {
		Dequeue<T> newNode=new Dequeue<T>(c);
		if(rear==null) {
			front=rear=newNode;
			newNode.next=null;
		}else {
			rear.next=newNode;
			rear=newNode;
			newNode.next=null;
		}
		size++;
	}
	public void addRear(T c) {
		Dequeue<T> newNode=new Dequeue<T>(c);
		if(front ==null) {
			
			front=newNode;
			rear=front;
		}else {
			rear.next=newNode;
			newNode.prev=rear;
			rear=newNode;
		}
		size++;
	}
	public T removeFront() {
		T ptr=null;
		if(front==null) {
			System.out.println("Queue is under flow");
		}else {
			ptr=front.data;
			front=front.next;
			
		}
		size--;
		return ptr;
	}
	public T removeRear() {
		T ptr=null;
		if(front==null) {
			System.out.println("Queue is under flow");
			
		}else {
			ptr=rear.data;
			rear=rear.prev;
			
		}
		size--;
		return ptr;
	}
	
	public boolean isEmpty() {
		if(front==null) 
			return true;
		else 
			return false;
		
	}
	public int size() {
		return size;
	}
	public void print() {
		Dequeue ptr=null;
		System.out.println("Available balance=");
		if(size==0) {
			System.out.println("empty");
			return;
			
		}
		Dequeue temp=front;
		while(temp!=null) {
			
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
