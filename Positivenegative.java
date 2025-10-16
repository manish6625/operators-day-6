package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Positivenegative {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter number");
			int n=s.nextInt();
			String result=(n>0)?"positive":"Negative";
			System.out.println(result);
			s.close();

	}

}
