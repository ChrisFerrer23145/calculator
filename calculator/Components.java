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
            if (equation.contains(flags[0])) {
                int test = equation.indexOf("%");
                int t2 = order.indexOf("%");
                if (t2 == order.length() - 1) {
                    double n = e.Sqrt(equation.substring(test + 1));
                    equation = equation.substring(0, test) + n;
                } else {
                    String t1 = Character.toString(order.charAt(t2 + 1));
                    int t3 = equation.indexOf(t1, test);
                    double n = e.Sqrt(equation.substring(test + 1, t3));
                    equation = equation.substring(0, test) + n + equation.substring(t3);
                }
            } else if (equation.contains(flags[1])) {
                int test = equation.indexOf("^");
                int t2 = order.indexOf("^");
                if (t2 == order.length() - 1) {
                    String t1 = Character.toString(order.charAt(t2 - 1));
                    int t3 = equation.indexOf(t1);
                    double n = e.Exponent(equation.substring(t3 + 1));
                    equation = equation.substring(0, t3 + 1) + n;
                } else {
                    String t1 = Character.toString(order.charAt(t2 + 1));
                    int t3 = equation.indexOf(t1, test);
                    double n = e.Exponent(equation.substring(test + 1, t3));
                    equation = equation.substring(0, test) + n + equation.substring(t3);
                }
            }
            order = order.substring(0, i) + order.substring(i + 1);
        }
        
        return equation;
    }
}
