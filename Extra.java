package com.columbushs.unit2;

public class Unit2_3ExternalMessage {
	
	public String messageName;
	public String writerName;
	
	public Unit2_3ExternalMessage(String name, String writer) {
		messageName = name;
		writerName = writer;
	}
	
	//calling methods in their own class
	public void writeMessage(){
		greeting();
		spacing();
		messsageBody();
		spacing();
		outro();
		spacing();
	}
	
	public void greeting() {
		System.out.println("Hello "+messageName);
		
	}
	
	public void messsageBody() {
		System.out.println("This is a letter about something and something else.");
		
	}
	public void outro() {
		System.out.println("Reguards,");
		System.out.println(writerName);
	}
	
	public void spacing() {
		System.out.println();
	}
	
	public void changeWriterToSteve() {
		writerName = "Steve";
	}
	

}
