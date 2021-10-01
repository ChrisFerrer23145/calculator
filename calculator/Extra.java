public class Extra {
    static double Sqrt(String equation){
        int point = equation.indexOf(".");
        double st2 = Integer.parseInt(equation.substring(point + 1));
        return((Math.sqrt(st2)));
    }
    static int Exponent(String equation){
        int point = equation.indexOf("^");
        int st1 = Integer.parseInt(equation.substring(0, point));
        int st2 = Integer.parseInt(equation.substring(point + 1));
        return((Math.pow(st1, st2)));
    }
}
