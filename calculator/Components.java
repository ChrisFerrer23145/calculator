// import java.util.Scanner;
public class Components {
    public String Determine(String chara, String order) {
        int i = 0;
        String[] flags = {"%", "^", "*", "/", "+", "-"};
        for (i=0;i<flags.length;i++) {
            if (chara.equals(flags[i])) {
                order += chara;
                break;
            }
        }
        return order;
    }

    public String Handle(String equation, String order) {
        int i = 0;
        Extra e = new Extra();
        Base b = new Base();
        String[] flags = {"%", "^", "*", "/", "+", "-"};
        for (i=0;i<order.length();i++) {
            int t1 = -1;
            if (Character.toString(order.charAt(i)).equals(flags[0])) {
                int test = equation.indexOf("%");
                int t2 = equation.indexOf(order.charAt(i+1));
                double n = e.Sqrt(equation.substring(test, t2));
                equation = equation.substring(0, test) + n + equation.substring(t2);
                System.out.println(equation);
            } else if (Character.toString(order.charAt(i)).equals(flags[1])) {
                int test = equation.indexOf("^");
                if (test != 0) {
                    t1 = equation.indexOf(order.charAt(i-1));
                }
                int t2 = equation.indexOf(order.charAt(i+1));
                double n = e.Exponent(equation.substring(t1 + 1, t2));
                equation = equation.substring(0, test) + n + equation.substring(t2);
                System.out.println(equation);
            } else if (Character.toString(order.charAt(i)).equals(flags[2])) {
                int test = equation.indexOf("*");
                if (test != 0) {
                    t1 = equation.indexOf(order.charAt(i-1));
                }
                int t2 = equation.indexOf(order.charAt(i+1));
                double n = b.Multiplication(equation.substring(t1 + 1, t2));
                equation = equation.substring(0, test) + n + equation.substring(t2);
                System.out.println(equation);
            }
            order = order.substring(0, i) + order.substring(i + 1);
        }
        
        return "error occurred";
    }
}
