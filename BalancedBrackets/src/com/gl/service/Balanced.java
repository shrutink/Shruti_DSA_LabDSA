package com.gl.service;
import java.util.Stack;

public class Balanced {
	public   void isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					System.out.println("The entered Strings do not contain Balanced Brackets");
					return;
				}
				char top=stack.peek();
				if((top=='(' && c==')')||(top=='{' && c=='}')||(top=='[' && c==']')) {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
