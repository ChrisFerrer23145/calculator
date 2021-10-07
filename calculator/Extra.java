public class Extra {
    double Sqrt(String equation){
        int point = equation.indexOf("%");
        double st2 = Integer.parseInt(equation.substring(point + 1));
        return((Math.sqrt(st2)));
    }
    double Exponent(String equation){
        int point = equation.indexOf("^");
        int st1 = Integer.parseInt(equation.substring(0, point));
        int st2 = Integer.parseInt(equation.substring(point+1));
        return((Math.pow(st1, st2)));
    }
    double Addition(String equation){
        int point = equation.indexOf("+");
        double st1 = Double.parseDouble(equation.substring(0, point));
        double st2 = Double.parseDouble(equation.substring(point + 1));
        return((st1 + st2));
    }
    double Subtraction(String equation){
        int point = equation.indexOf("-");
        double st1 = Double.parseDouble(equation.substring(0, point));
        double st2 = Double.parseDouble(equation.substring(point + 1));
        return((st1 - st2));
    }
    double Multiplication(String equation){
        int point = equation.indexOf("*");
        double st1 = Double.parseDouble(equation.substring(0, point));
        double st2 = Double.parseDouble(equation.substring(point + 1));
        return((st1 * st2));
    }
    double Division(String equation){
        int point = equation.indexOf("/");
        double st1 = Double.parseDouble(equation.substring(0, point));
        double st2 = Double.parseDouble(equation.substring(point + 1));
        return((st1/st2));
    }
}
