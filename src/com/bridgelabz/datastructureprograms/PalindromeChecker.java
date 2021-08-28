package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class PalindromeChecker {
	
	public static void main(String args[]) {
		int flag=0;
		MyDequeue dequeue=new MyDequeue();
		System.out.println("Enter Any String");
		Scanner sc =new Scanner(System.in);
	    String string=sc.nextLine();
	    
	    for(int i=0;i<string.length();i++) {
		
	    	char c=string.charAt(i);
		
	    	dequeue.addFront(c);
	
	    } 
	    while(dequeue.size()>1) {
	    	
	    	if(dequeue.removeFront()!=dequeue.removeRear()) {
	    		flag=1;
	    		break;
	    	}
	    }
	    if(flag==0) {
	    	System.out.println("palindrome");
	    }else {
	    	System.out.println("not palindrome");
	    }
	
	}
}
