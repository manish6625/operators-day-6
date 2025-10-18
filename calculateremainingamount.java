package com.codegnan.operatorexamples;

import java.util.Scanner;

public class calculateremainingamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter amount");
		double n=s.nextDouble();
		double discount=(n>100)?n*0.2:((n>=50)?n*0.1:n*0.0);
		double rm=n-discount;
		System.out.println("The discount amount is: "+discount);
		System.out.println("The remaining amount after discount is :"+rm);
		s.close();


	}

}
