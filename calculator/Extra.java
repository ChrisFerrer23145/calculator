public class Extra {
	static double Sqrt(String equation){
        int point = equation.indexOf(".");
        double st2 = Integer.parseInt(equation.substring(point + 1));
        return((Math.sqrt(st2)));
    }
}