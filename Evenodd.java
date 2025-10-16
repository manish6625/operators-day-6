package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		String result=(n%2==0)?"even":"odd";
		System.out.println(result);
		s.close();

	}

}
