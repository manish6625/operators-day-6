package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Taxbracket {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter income:");
		double i=s.nextDouble();
		double result=(i<300000)?i*5/100:(i>=300000 && i<=1000000)?i*10/100:(i>1000000 && i<=2000000)?i*15/100:i*1.01;
		System.out.println(result);
		s.close();

	}

}
