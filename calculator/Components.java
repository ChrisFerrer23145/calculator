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
                int orem = order.indexOf(flags[0]);
                order = order.substring(0, orem) + order.substring(orem + 1);
            } else if (equation.contains(flags[1])) {
                int test = equation.indexOf("^");
                int t2 = order.indexOf("^");
                if (t2 == 0) {
                    String t3 = Character.toString(order.charAt(1));
                    int t4 = equation.indexOf(t3);
                    System.out.println(equation.substring(0, t4));
                    double n = e.Exponent(equation.substring(0, t4));
                    equation = n + equation.substring(t4);
                } else if (t2 == order.length() - 1) {
                    String x = Character.toString(order.charAt(t2 - 1));
                    int y = 0;
                    int index;
                    String ord = equation.substring(0, test);
                    for (index = 0; index < ord.length();index++){
                        if (x.equals(Character.toString(equation.charAt(index)))) {
                            y = index;
                        }
                    }
                    double n = e.Exponent(equation.substring(y));
                    equation = equation.substring(0, y + 1) + n;
                } else {
                    String t3 = Character.toString(order.charAt(t2 + 1));
                    String t4 = equation.substring(test);
                    int t5 = equation.length() - t4.length() + t4.indexOf(t3);
                    String x = Character.toString(order.charAt(t2 - 1));
                    int y = 0;
                    int index;
                    String ord = equation.substring(0, test);
                    for (index = 0; index < ord.length();index++){
                        if (x.equals(Character.toString(equation.charAt(index)))) {
                            y = index;
                        }
                    }
                    double n = e.Exponent(equation.substring(y, t5));
                    equation = equation.substring(0, test - 1) + n + equation.substring(t5); 
                }
                int orem = order.indexOf(flags[1]);
                order = order.substring(0, orem) + order.substring(orem + 1);
            }
        }
        return equation;
    }
}
