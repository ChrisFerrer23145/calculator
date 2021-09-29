import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        	Scanner myobj = new Scanner(System.in);
        	System.out.println("Enter equation");
        	String eq = myobj.nextLine();
        	Base t = new Base();
        	if (eq.contains("+")) {
        	    System.out.println(Addition(eq));
        	} else if (eq.contains("/")) {
        	    System.out.println(Division(eq)); 
        	} else if (eq.contains("-")) {
        	    System.out.println(Subtraction(eq));
        	} else if (eq.contains("*")) {
        	    System.out.println(Multiplication(eq));
        	}
    	}

	
}
