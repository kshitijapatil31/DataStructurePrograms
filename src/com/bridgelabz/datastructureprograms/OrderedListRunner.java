package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class OrderedListRunner {
static Node node;
	public static void main(String[] args) {
		OrderedList oList=new OrderedList();
		oList.addNode(5);
		oList.addNode(1);
		oList.addNode(4);
		oList.addNode(3);
		oList.addNode(6);
		oList.addNode(8);
		oList.addNode(2);
		oList.addNode(9);
		oList.addNode(7);
	    oList.sortList();
		oList.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num to search");
		int num=sc.nextInt();
		node=oList.search(num);
		oList.sortList();
		oList.display();
	}

}
