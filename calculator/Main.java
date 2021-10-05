import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int i = 0;
		for (i=0;i<i+1;i++) {
        	Scanner myobj = new Scanner(System.in);
			if (i==0) {
        			System.out.println("Enter equation. For addition, use a + between each number. For subtraction, use a -. For multiplication use *, and for division use /. Square roots use percents, so '%25' prints 5. Exponents use ^, so '5^3' prints 125. For example, to do addition, you would use '691+234', which would print 925.");
			} else {
				System.out.println("Enter next equation");
			}
			String eq = myobj.nextLine();
        	Base b = new Base();
			Extra e = new Extra();
			Components c = new Components();
			int inc = 0;
			// String[] flags = {"%", "^", "*", "/", "+", "-"};
			String order = "";
			int counter = 0;
			for(inc=0;inc < eq.length();inc++) {
				order = c.Determine(Character.toString(eq.charAt(inc)), order);
			}
			counter = order.length();
			if (counter > 1) {
				System.out.println(c.Handle(eq, counter, order));
			}
			else if (eq.contains("%")) {
				System.out.println(e.Sqrt(eq));
			}
			else if (eq.contains("^")) {
        		System.out.println(e.Exponent(eq));
        	}
			else if (eq.contains("*")) {
				System.out.println(b.Multiplication(eq));
			}
			else if (eq.contains("/")) {
				System.out.println(b.Division(eq)); 
			}
        	else if (eq.contains("+")) {
        	    System.out.println(b.Addition(eq));
        	}
			else if (eq.contains("-")) {
        	    System.out.println(b.Subtraction(eq));
        	} else {
				System.out.println("unknown character detected");
			}
		}
    }
}
