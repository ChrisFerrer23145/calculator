public class Base {
    double Addition(String equation){
        int point = equation.indexOf("+");
        String eq1;
        String eq2;
        double st1;
        double st2;
        if (!equation.substring(0, point).contains(".")) {
            eq1 = equation.substring(0, point) + ".0";
            st1 = Double.parseDouble(eq1);
        } else {
            st1 = Double.parseDouble(equation.substring(point + 1));
        }
        if (!equation.substring(point + 1).contains(".")) {
            eq2 = equation.substring(point + 1) + ".0";
            st2 = Double.parseDouble(eq2);
        } else {
            st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((st1 + st2));
    }
    double Subtraction(String equation){
        int point = equation.indexOf("-");
        String eq1;
        String eq2;
        double st1;
        double st2;
        if (!equation.substring(0, point).contains(".")) {
            eq1 = equation.substring(0, point) + ".0";
            st1 = Double.parseDouble(eq1);
        } else {
            st1 = Double.parseDouble(equation.substring(point + 1));
        }
        if (!equation.substring(point + 1).contains(".")) {
            eq2 = equation.substring(point + 1) + ".0";
            st2 = Double.parseDouble(eq2);
        } else {
            st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((st1 - st2));
    }
    double Multiplication(String equation){
        int point = equation.indexOf("*");
        String eq1;
        String eq2;
        double st1;
        double st2;
        if (!equation.substring(0, point).contains(".")) {
            eq1 = equation.substring(0, point) + ".0";
            st1 = Double.parseDouble(eq1);
        } else {
            st1 = Double.parseDouble(equation.substring(point + 1));
        }
        if (!equation.substring(point + 1).contains(".")) {
            eq2 = equation.substring(point + 1) + ".0";
            st2 = Double.parseDouble(eq2);
        } else {
            st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((st1 * st2));
    }
    double Division(String equation){
        int point = equation.indexOf("/");
        String eq1;
        String eq2;
        double st1;
        double st2;
        if (!equation.substring(0, point).contains(".")) {
            eq1 = equation.substring(0, point) + ".0";
            st1 = Double.parseDouble(eq1);
        } else {
            st1 = Double.parseDouble(equation.substring(point + 1));
        }
        if (!equation.substring(point + 1).contains(".")) {
            eq2 = equation.substring(point + 1) + ".0";
            st2 = Double.parseDouble(eq2);
        } else {
            st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((st1/st2));
    }
}
