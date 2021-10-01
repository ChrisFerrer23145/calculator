import java.io.InputStream;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int i = 0;
		for (i=0;i<i+1;i++) {
        		Scanner myobj = new Scanner(System.in);
			if (i==0) {
        			System.out.println("Enter equation. For addition, use a + between each number. For subtraction, use a -. For multiplication use *, and for division use /. Square roots use periods, so '.25' prints 5. Exponents use ^, so '5^3' prints 125. For example, to do addition, you would use '691+234', which would print 925");
			} else {
				System.out.println("Enter next equation");
			}
			String eq = myobj.nextLine();
        		Base t = new Base();
			Extra v = new Extra();
			if (eq.contains(".")) {
				System.out.println(v.Sqrt(eq));
			}
			else if (eq.contains("^")) {
        			System.out.println(v.Exponent(eq));
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
}
