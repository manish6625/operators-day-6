package com.codegnan.operatorexamples;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks");
		double m=s.nextDouble();
		char result=((m>=90)?'A':(m>=80)?'B': (m>=70)?'C': (m>=60)?'D': (m>=50)?'E':'F');
		System.out.println("The Grade is: " +result);
		//System.out.println("The remaining amount after discount is :"+rm);
		s.close();

	}

}
