package com.bridgelabz.datastructureprograms;

public class MyLinkedList <T>{

	MyNode head;
	
	public MyNode search(MyNode node,String word) {
		MyNode tempNode=node;
		while(node!=null && tempNode.next !=null) {
			if(word.compareTo((node.next).data)==0) {
				node.next=(node.next).next;
				System.out.println("word is found");
				System.out.println("word is deleted from list");
			return tempNode;
			}
			node=node.next;
		}
		System.out.println("word is not found");
		System.out.println("the word is added to the list");
		tempNode=addWordToList(tempNode,word);
		return tempNode;
	}
	
	
	public MyNode addWordToList(MyNode node,String word) {
		MyNode temp=node;
		MyNode newNode=new MyNode();
		newNode.data=word;
		newNode.next=null;
		if(node==null) {
			return newNode;
		}else {
			while(node.next!=null) {
				node=node.next;
			}
			node.next=newNode;
			
		}
		return temp;
	}
	public void addList(String str) {
		
	}
	public void printList() {
		MyNode n=head;
		while(n!=null) {
			System.out.println(n.key);
			n=n.next;
		}
	}
	
}