public class Base {

    static int Addition(String equation){
        int point = equation.indexOf("+");
        int st1 = Integer.parseInt(equation.substring(0, point));
        int st2 = Integer.parseInt(equation.substring(point + 1));
        return((st1 + st2));
    }
    static int Subtraction(String equation){
        int point = equation.indexOf("-");
        int st1 = Integer.parseInt(equation.substring(0, point));
        int st2 = Integer.parseInt(equation.substring(point + 1));
        return((st1 - st2));
    }
    static int Multiplication(String equation){
        int point = equation.indexOf("*");
        int st1 = Integer.parseInt(equation.substring(0, point));
        int st2 = Integer.parseInt(equation.substring(point + 1));
        return((st1 * st2));
    }
    static double Division(String equation){
        int point = equation.indexOf("/");
        double st1 = Integer.parseInt(equation.substring(0, point));
        double st2 = Integer.parseInt(equation.substring(point + 1));
        return((st1/st2));
    }
}


