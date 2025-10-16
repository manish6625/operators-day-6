package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter number");
			int n=s.nextInt();
			String result=(n%5==0)?"Divisible by 5":"Not divisible by 5";
			System.out.println(result);
			s.close();

	}

}
