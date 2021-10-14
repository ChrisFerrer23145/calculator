import java.util.Set;
public class Components {
    String[] flags = {"%", "^", "*", "/", "+", "-"};
    public String Determine(String chara, String order) {
        int i = 0;
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
        for (i=0;i<order.length();i = i) {
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
                if (orem + 1 > order.length() - 1) {
                    order = order.substring(0, orem);
                } else {
                    order = order.substring(0, orem) + order.substring(orem + 1);
                }
            } else if (equation.contains(flags[1])) {
                int test = equation.indexOf("^");
                int t2 = order.indexOf("^");
                if (t2 == 0) {
                    String t3 = Character.toString(order.charAt(t2 + 1));
                    String t4 = equation.substring(test);
                    int t5 = equation.length() - t4.length() + t4.indexOf(t3);
                    double n = e.Exponent(equation.substring(0, t5));
                    equation = n + equation.substring(t5);
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
                    double n = e.Exponent(equation.substring(y + 1));
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
                if (orem + 1 > order.length() - 1) {
                    order = order.substring(0, orem);
                } else {
                    order = order.substring(0, orem) + order.substring(orem + 1);
                }
            } else {
                break;
            }
        }
        return equation + "=" + order;
    }
    
    public String ASo(String equation, String order) {
        int i = 0;
        Base b = new Base();
        for (i=0;i<order.length();i = i) { 
            if (equation.contains(flags[4]) || equation.contains(flags[5])) {
                if (Character.toString(order.charAt(0)).equals(flags[4])) {
                    int test = equation.indexOf("+");
                    int t2 = order.indexOf("+");
                    if (order.length() > 1) {
                        String t3 = Character.toString(order.charAt(t2 + 1));
                        String t4 = equation.substring(test + 1);
                        int t5 = equation.length() - t4.length() + t4.indexOf(t3);
                        double n = b.Addition(equation.substring(0, t5));
                        int a2 = t4.indexOf(t3) + equation.substring(0, test).length() + 1;
                        equation = n + equation.substring(a2);
                    } else {
                        double n = b.Addition(equation);
                        equation = n + "";
                    }
                    int orem = order.indexOf(flags[4]);
                    if (orem + 1 > order.length()) {
                        order = order.substring(0, orem);
                    } else {
                        order = order.substring(0, orem) + order.substring(orem + 1);
                    }
                } else if (Character.toString(order.charAt(0)).equals(flags[5])){
                    int test = equation.indexOf("-");
                    int t2 = order.indexOf("-");
                    if (order.length() > 1) {
                        String t3 = Character.toString(order.charAt(t2 + 1));
                        String t4 = equation.substring(test + 1);
                        int t5 = equation.length() - t4.length() + t4.indexOf(t3);
                        double n = b.Subtraction(equation.substring(0, t5));
                        int a2 = t4.indexOf(t3) + equation.substring(0, test).length() + 1;
                        equation = n + equation.substring(a2);
                    } else {
                        double n = b.Subtraction(equation);
                        equation = n + "";
                    }
                    int orem = order.indexOf(flags[5]);
                    if (orem + 1 > order.length()) {
                        order = order.substring(0, orem);
                    } else {
                        order = order.substring(0, orem) + order.substring(orem + 1);
                    }
                }
            }
        }
    return equation;
        
    }
    
    public String MDo(String equation, String order) {
        int i = 0;
        Base b = new Base();
        for (i=0;i<order.length();i = i) {
            if (equation.contains(flags[2]) || equation.contains(flags[3])) {
                if (((equation.indexOf(flags[2]) < equation.indexOf(flags[3])) && equation.indexOf(flags[3]) != -1 && equation.contains(flags[2])) || (equation.contains(flags[2]) && !equation.contains(flags[3]))) {
                        int test = equation.indexOf("*");
                        int t2 = order.indexOf("*");
                        if (order.length() == 1) {
                            double n = b.Multiplication(equation);
                            equation = n + "";
                        } else if (t2 == 0) {
                            String t3 = Character.toString(order.charAt(t2 + 1));
                            String t4 = equation.substring(test + 1);
                            int t5 = equation.length() - t4.length() + t4.indexOf(t3);
                            double n = b.Multiplication(equation.substring(0, t5));
                            int a2 = t4.indexOf(t3) + equation.substring(0, test).length() + 1;
                            equation = n + equation.substring(a2);
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
                            double n = b.Multiplication(equation.substring(y + 1));
                            equation = equation.substring(0, y + 1) + n;
                        } else {
                            String t3 = Character.toString(order.charAt(t2 + 1));
                            String t4 = equation.substring(test + 1);
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
                            double n = b.Multiplication(equation.substring(y + 1, t5));
                            equation = equation.substring(0, y + 1) + n + equation.substring(t5); 
                        }
                        int orem = order.indexOf(flags[2]);
                        if (orem + 1 > order.length()) {
                            order = order.substring(0, orem);
                        } else {
                            order = order.substring(0, orem) + order.substring(orem + 1);
                        }
                } else if (equation.indexOf(flags[3]) != -1) {
                    int test = equation.indexOf("/");
                    int t2 = order.indexOf("/");
                    if (order.length() == 1) {
                        double n = b.Division(equation);
                        equation = n + "";
                    } else if (t2 == 0) {
                        String t3 = Character.toString(order.charAt(t2 + 1));
                        String t4 = equation.substring(test + 1);
                        int t5 = equation.length() - t4.length() + t4.indexOf(t3);
                        double n = b.Division(equation.substring(0, t5));
                        int a2 = t4.indexOf(t3) + equation.substring(0, test).length() + 1;
                        equation = n + equation.substring(a2);
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
                        double n = b.Division(equation.substring(y + 1));
                        equation = equation.substring(0, y + 1) + n;
                    } else {
                        String t3 = Character.toString(order.charAt(t2 + 1));
                        String t4 = equation.substring(test + 1);
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
                        double n = b.Division(equation.substring(y + 1, t5));
                        equation = equation.substring(0, y + 1) + n + equation.substring(t5); 
                    }
                    int orem = order.indexOf(flags[3]);
                    if (orem + 1 > order.length()) {
                        order = order.substring(0, orem);
                    } else {
                        order = order.substring(0, orem) + order.substring(orem + 1);
                    }
                }
            } else {
                break;
            }
        }
    return equation + "=" + order;
    }
}
