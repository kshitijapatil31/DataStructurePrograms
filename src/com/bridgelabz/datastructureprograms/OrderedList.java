package com.bridgelabz.datastructureprograms;

public class OrderedList <T>{

	Node head;
	Node tail;
	
	public OrderedList() {
		head=null;
		tail=null;
	}
	
	public Node addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		return newNode;
	}
	public void sortList() {
		Node current=head , index=null;
		int temp;
		
		if(head==null) {
			return;
		}else {
			while(current!=null) {
				index=current.next;
			
			while(index!=null) {
				if(current.data >index.data) {
					temp=current.data;
					current.data=index.data;
					index.data=temp;
				}
				index=index.next;
			}
			current=current.next;
			}
		}
	}
	public  void deleteNode(int key) {
		Node temp=head,prev=null;
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		while(temp!= null&& temp.data!=key) {
			prev =temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		prev.next=temp.next;

			
	}
	
	public Node search(int num) {
		Node tempNode=head;
		if(head==null){
			System.out.println("list is empty");
		}else {
		while(tempNode!=null) {
			if(tempNode.data==num ){
				
				System.out.println("word is found");
				deleteNode(num);
				System.out.println("word is deleted from list");
			return tempNode;
			}
			tempNode=tempNode.next;
		}
		System.out.println("word is not found");
		System.out.println("the word is added to the list");
		tempNode=addNode(num);
		}
		return tempNode;
	}
	
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	System.out.println();
	}
}
