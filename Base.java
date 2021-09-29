package com.columbushs.unit2;

public class Unit2_1External {
	
	//constructors
	String constName;
	int constAge;
	double constDecimal;
//	private String constName;
//	private int constAge;
//	private double constDecimal;


	public Unit2_1External(String constName, int constAge, double constDecimal){
	  
	  System.out.println("Object Created with constructor 1 Name, Age, miles");
	}



	public Unit2_1External(String cn, int ca){
	  constName = cn;
	  constAge = ca;
	  constDecimal = 0;
	  System.out.println("Object Created with constructor 2 Name, Age");

	}

	public Unit2_1External(){
	  constName = null;
	  constAge = 0;
	  constDecimal = 0;
	  System.out.println("Object Created with constructor 3 empty");

	}


	public void unit2_1Method(String name, int age, int milesRun ){
	   
	    System.out.println("We're using the method with milesRun");
	    System.out.println(name);
	    System.out.println(age);
	    System.out.println(milesRun);

	 }

	 public void unit2_1Method(String name, int age){

	   System.out.println("We're using the method without milesRun");
	    System.out.println(name);
	    System.out.println(age);


	 }
	 
	 public void printName(){

		   System.out.println("This is the name: "+constName);



		 }

	}


