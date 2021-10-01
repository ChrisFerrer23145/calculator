import java.io.InputStream;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        	Scanner myobj = new Scanner(System.in);
        	System.out.println("Enter equation. For addition, use a + between each number. For subtraction, use a -. For multiplication use *, and for division use /. For example, to do addition, you would do '691+234', which would print 925");
        	String eq = myobj.nextLine();
        	Base t = new Base();
			Extra v = new Extra();
			if (eq.contains(".")) {
				System.out.println(v.Sqrt(eq));
			}
			else if (eq.contains("*")) {
				System.out.println(t.Multiplication(eq));
			}
			else if (eq.contains("/")) {
				System.out.println(t.Division(eq)); 
			}
        	else if (eq.contains("+")) {
        	    System.out.println(t.Addition(eq));
        	}
			else if (eq.contains("-")) {
        	    System.out.println(t.Subtraction(eq));
        	}
    	}
}