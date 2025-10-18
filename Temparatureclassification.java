package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Temparatureclassification {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Temperature:");
		int h=s.nextInt();
		String result=(h>30)?"Hot":(h>=15 && h<=30)?"Moderate":"cold";
		System.out.println(result);
		s.close();		

	}

}
