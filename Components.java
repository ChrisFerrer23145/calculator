package com.columbushs.unit2;

import java.util.Scanner;

//Import Scanner



public class ExtraScannerTesting {
	
	public void inputStuff() {
		
		Scanner inputInfo = new Scanner(System.in);
		
		System.out.print("What is your first Name?");
		String firstName = inputInfo.next();
		
		System.out.print("What is your last Name?");
		String lastName = inputInfo.next();
		
		System.out.print("What is your age?");
		int age = inputInfo.nextInt();
		
		System.out.print("What is your favorite decimal?");
		double decimal = inputInfo.nextDouble();
		
		System.out.print("What is your favorite quote?");
		String quote = inputInfo.next();
		quote += inputInfo.nextLine();
		
		
		
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Decimal: "+decimal);
		System.out.println("Quote: "+quote);
		
		
	}




}
