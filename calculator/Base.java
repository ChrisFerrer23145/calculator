public class Base {
    int Addition(String equation){
        int point = equation.indexOf("+");
        int st1 = Integer.parseInt(equation.substring(0, point));
        int st2 = Integer.parseInt(equation.substring(point + 1));
        return((st1 + st2));
    }
    int Subtraction(String equation){
        int point = equation.indexOf("-");
        int st1 = Integer.parseInt(equation.substring(0, point));
        int st2 = Integer.parseInt(equation.substring(point + 1));
        return((st1 - st2));
    }
    int Multiplication(String equation){
        int point = equation.indexOf("*");
        int st1 = Integer.parseInt(equation.substring(0, point));
        int st2 = Integer.parseInt(equation.substring(point + 1));
        return((st1 * st2));
    }
    double Division(String equation){
        int point = equation.indexOf("/");
        double st1 = Integer.parseInt(equation.substring(0, point));
        double st2 = Integer.parseInt(equation.substring(point + 1));
        return((st1/st2));
    }
}
