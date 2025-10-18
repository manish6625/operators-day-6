package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Parkingcharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of hours to park the vehicle");
		int h=scanner.nextInt();
		int fee=(h<=3)?(h*2):(h*2+(h-3)*1);
		System.out.println(fee);
		scanner.close();
	}

}
