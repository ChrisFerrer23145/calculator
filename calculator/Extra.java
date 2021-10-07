public class Extra {
    double Sqrt(String equation){
        int point = equation.indexOf("%");
        if !(equation.substring(point + 1).contains(".")) {
            String eq2 = equation.substring(point + 1) + ".0"
            double st2 = Double.parseDouble(eq2);
        } else {
            double st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((Math.sqrt(st2)));
    }
    double Exponent(String equation){
        int point = equation.indexOf("^");
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
        return((Math.pow(st1, st2)));
    }
}
