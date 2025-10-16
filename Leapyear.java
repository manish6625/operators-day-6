package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			System.out.println("enter year");
			int n=s.nextInt();
			String result=((n%4==0 || n%400==0) && n%100!=0)?"leap":"Not a leapyear";
			System.out.println(result);
			s.close();


	}

}
