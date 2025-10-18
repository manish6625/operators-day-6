package com.codegnan.operatorexamples;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.err.println("Enter amount:");
		double amount=s.nextDouble();
		double res=(amount>=1000)?amount*0.8:(amount>=500)?amount*0.9:0;
		System.out.println(res);
		s.close();
	}

}
