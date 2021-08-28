package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class CashCounter {

	public static void main(String[] args) {
		MyDequeue dequeue=new MyDequeue();
		int ch=0;
		do {
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.number of people");
			System.out.println("Enter the choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the amount u want to deposit");
				int amount=sc.nextInt();
				dequeue.addRear(amount);
				dequeue.print();
				break;
			case 2:
				System.out.println("enter the amount u want to withdraw");
				int amount2=sc.nextInt();
				dequeue.removeFront();
				dequeue.print();
				break;
			
			case 3:
				System.out.println("Number of people");
				int j=dequeue.size();
				System.out.println(j);
				break;
				
			default: 
		   		System.out.println("You entered wrong choice");
		   		break;
			}
		}
		while(ch<5);
		
	}

}
