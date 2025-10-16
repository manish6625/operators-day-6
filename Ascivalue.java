package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Ascivalue {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter a Character:");
			char n=s.next().charAt(0);
		    int a=(int)n;
			System.out.println(a);
			s.close();

	}

}
