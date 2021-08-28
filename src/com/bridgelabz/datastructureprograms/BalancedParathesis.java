package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class BalancedParathesis {

	public static void main(String args[]) {

		StackOperation stack = new StackOperation();

		System.out.println("Parenthesis matching");

		System.out.println("Enter Expression");

		Scanner sc = new Scanner(System.in);

		String expression = sc.nextLine();

		int length = expression.length();

		for (int i = 0; i < length; i++) {

			char ch = expression.charAt(i);

			if (ch == '(') {

				stack.push(i);

			} else if (ch == ')') {

				int n = (stack.pop() + 1);
				System.out.println("')' at index " + (i + 1) + " matched with '(' at index " + n);
			}
			while (!stack.isEmpty()) {
				System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
			}

		}
	}
}
