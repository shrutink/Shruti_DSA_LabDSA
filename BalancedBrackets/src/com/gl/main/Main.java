package com.gl.main;
import com.gl.service.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balanced obj=new Balanced();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input string");
		String input=sc.next();
		obj.isBalanced(input);
		sc.close();
	}
}
