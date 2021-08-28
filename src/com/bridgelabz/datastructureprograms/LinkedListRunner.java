package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class LinkedListRunner {
static MyNode node;
	public static void main(String[] args) {

		String string ="to be or not to be";
        MyLinkedList <String>myLinkedList=new MyLinkedList<>();
        MyLinkedList myLinkedList1=new MyLinkedList();
        String []str=string.split(" ");
      
         myLinkedList1.printList();
		System.out.println("Enter the word to search");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
	    node=myLinkedList1.search(node,word);
		System.out.println(node);

		
	}

}
