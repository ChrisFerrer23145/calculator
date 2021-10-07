public class Base {
    double Addition(String equation){
        int point = equation.indexOf("+");
        if !(equation.substring(0, point).contains(".")) {
            String eq1 = equation.substring(0, point) + ".0"
            double st1 = Double.parseDouble(eq2);
        } else {
            double st1 = Double.parseDouble(equation.substring(point + 1));
        }
        if !(equation.substring(point + 1).contains(".")) {
            String eq2 = equation.substring(point + 1) + ".0"
            double st2 = Double.parseDouble(eq2);
        } else {
            double st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((st1 + st2));
    }
    double Subtraction(String equation){
        int point = equation.indexOf("-");
        if !(equation.substring(0, point).contains(".")) {
            String eq1 = equation.substring(0, point) + ".0"
            double st1 = Double.parseDouble(eq2);
        } else {
            double st1 = Double.parseDouble(equation.substring(point + 1));
        }
        if !(equation.substring(point + 1).contains(".")) {
            String eq2 = equation.substring(point + 1) + ".0"
            double st2 = Double.parseDouble(eq2);
        } else {
            double st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((st1 - st2));
    }
    double Multiplication(String equation){
        int point = equation.indexOf("*");
        if !(equation.substring(0, point).contains(".")) {
            String eq1 = equation.substring(0, point) + ".0"
            double st1 = Double.parseDouble(eq2);
        } else {
            double st1 = Double.parseDouble(equation.substring(point + 1));
        }
        if !(equation.substring(point + 1).contains(".")) {
            String eq2 = equation.substring(point + 1) + ".0"
            double st2 = Double.parseDouble(eq2);
        } else {
            double st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((st1 * st2));
    }
    double Division(String equation){
        int point = equation.indexOf("/");
        if !(equation.substring(0, point).contains(".")) {
            String eq1 = equation.substring(0, point) + ".0"
            double st1 = Double.parseDouble(eq2);
        } else {
            double st1 = Double.parseDouble(equation.substring(point + 1));
        }
        if !(equation.substring(point + 1).contains(".")) {
            String eq2 = equation.substring(point + 1) + ".0"
            double st2 = Double.parseDouble(eq2);
        } else {
            double st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((st1/st2));
    }
}
