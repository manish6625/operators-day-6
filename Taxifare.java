package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Taxifare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the distance");
		int k=scanner.nextInt();
		double fee=((k<=2)?(50):(k<=10)?(k-2)*15+50:(50+(8*15)+(k-10)*10));
		fee=(k>20)?fee*0.95:fee;
		System.out.println(fee);
		scanner.close();

	}

}
