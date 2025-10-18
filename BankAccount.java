package com.codegnan.operatorexamples;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Balance:");
		int h=s.nextInt();
		String result=(h>=1000)?"Good Standing":(h>=500 && h<999)?"Low Balance":"Account overdrawn";
		System.out.println(result);
		s.close();		

	}

}
