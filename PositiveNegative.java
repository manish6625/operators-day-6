package com.codegnan.operatorexamples;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int h=s.nextInt();
		String result=(h>0)?"positive":(h<0)?"Negative":"Zero";
		System.out.println(result);
		s.close();		

	}

}
