// import java.util.Scanner;
public class Components {
    public String Determine(String chara, String order) {
        int i = 0;
        String[] flags = {".", "^", "*", "/", "+", "-"};
        for (i=0;i<flags.length;i++) {
            if (chara.equals(flags[i])) {
                order += chara;
                break;
            }
        }
        return order;
    }

    public String Handle(String equation, int num, String order) {
        int i = 0;
        Extra e = new Extra();
        String[] flags = {".", "^", "*", "/", "+", "-"};
        for (i=0;i<order.length();i++) {
            int t1 = -1;
            if (Character.toString(order.charAt(i)).equals(flags[0])) {
                int test = equation.indexOf(".");
                if (i == order.length() - 1) {
                    double n = e.Sqrt(equation.substring(test));
                    equation = equation.substring(0, test) + n;
                } else {
                    int t2 = equation.indexOf(order.charAt(i+1));
                    double n = e.Sqrt(equation.substring(test, t2));
                    equation = equation.substring(0, test) + n + equation.substring(t2);
                }
                System.out.println(equation);
            } else if (Character.toString(order.charAt(i)).equals(flags[1])) {
                int test = equation.indexOf("^");
                if (i == order.length() - 1) {
                    t1 = equation.indexOf(order.charAt(i-0));
                    double n = e.Exponent(equation.substring(t1 + 1);
                    equation = equation.substring(0, test) + n;
                } else {
                    if (test != 0) {
                        t1 = equation.indexOf(order.charAt(i-1));
                    }
                    int t2 = equation.indexOf(order.charAt(i+1));
                    double n = e.Exponent(equation.substring(t1 + 1, t2));
                    equation = equation.substring(0, test) + n + equation.substring(t2);
                }
                System.out.println(equation);
            } else if (Character.toString(order.charAt(i)).equals(flags[2])) {
                int test = equation.indexOf("*");
                if (i == order.length() - 1) {
                    t1 = equation.indexOf(order.charAt(i-0));
                    double n = e.Multiplication(equation.substring(t1 + 1);
                    equation = equation.substring(0, test) + n;
                } else {
                    if (test != 0) {
                        t1 = equation.indexOf(order.charAt(i-1));
                    }
                    int t2 = equation.indexOf(order.charAt(i+1));
                    double n = e.Multiplication(equation.substring(t1 + 1, t2));
                    equation = equation.substring(0, test) + n + equation.substring(t2);
                }
                System.out.println(equation);
            } else if (Character.toString(order.charAt(i)).equals(flags[3])) {
                int test = equation.indexOf("/");
                if (i == order.length() - 1) {
                    t1 = equation.indexOf(order.charAt(i-0));
                    double n = e.Division(equation.substring(t1 + 1);
                    equation = equation.substring(0, test) + n;
                } else {
                    if (test != 0) {
                        t1 = equation.indexOf(order.charAt(i-1));
                    }
                    int t2 = equation.indexOf(order.charAt(i+1));
                    double n = e.Division(equation.substring(t1 + 1, t2));
                    equation = equation.substring(0, test) + n + equation.substring(t2);
                }
                System.out.println(equation);
            } else if (Character.toString(order.charAt(i)).equals(flags[4])) {
                int test = equation.indexOf("+");
                if (i == order.length() - 1) {
                    t1 = equation.indexOf(order.charAt(i-0));
                    double n = e.Addition(equation.substring(t1 + 1);
                    equation = equation.substring(0, test) + n;
                } else {
                    if (test != 0) {
                        t1 = equation.indexOf(order.charAt(i-1));
                    }
                    int t2 = equation.indexOf(order.charAt(i+1));
                    double n = e.Addition(equation.substring(t1 + 1, t2));
                    equation = equation.substring(0, test) + n + equation.substring(t2);
                }
                System.out.println(equation);
            } else if (Character.toString(order.charAt(i)).equals(flags[5])) {
                int test = equation.indexOf("-");
                if (i == order.length() - 1) {
                    t1 = equation.indexOf(order.charAt(i-0));
                    double n = e.Subtraction(equation.substring(t1 + 1);
                    equation = equation.substring(0, test) + n;
                } else {
                    if (test != 0) {
                        t1 = equation.indexOf(order.charAt(i-1));
                    }
                    int t2 = equation.indexOf(order.charAt(i+1));
                    double n = e.Subtraction(equation.substring(t1 + 1, t2));
                    equation = equation.substring(0, test) + n + equation.substring(t2);
                }
                System.out.println(equation);
            }
            order = order.substring(0, i) + order.substring(i + 1);
        }
        
        return "error occurred";
    }
}
