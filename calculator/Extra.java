public class Extra {
    Components c = new Components();
    double SendOff(String equation, String order) {
        int i = 0;
        for(i=0;i<order.length();i++) {
            if (order.contains("(")){
                int x = equation.indexOf("(");
                int y = equation.indexOf(")");
                String eq = equation.substring(x + 1, y);
                for(inc=0;inc < eq.length();inc++) {
				    String ordx = c.Determine(Character.toString(eq.charAt(inc)), "");
			    }
                equation = equation.substring(0, x) + SendOff(eq, ordx) + equation.substring(y + 1);
            }
        }
        equation = c.Handle(eq, order);
        int eqs = equation.indexOf("=");
        equation = c.MDo(equation.substring(0, eqs), equation.substring(eqs + 1));
        eqs = equation.indexOf("=");
        equation = c.ASo(equation.substring(0, eqs), equation.substring(eqs + 1));
        double equation2 = Double.parseDouble(equation);
        return equation2;
    }
    double Sqrt(String equation){
        String eq2;
        double st2;
        int point = equation.indexOf("%");
        if (!equation.substring(point + 1).contains(".")) {
            eq2 = equation.substring(point + 1) + ".0";
            st2 = Double.parseDouble(eq2);
        } else {
            st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((Math.sqrt(st2)));
    }
    double Exponent(String equation){
        int point = equation.indexOf("^");
        String eq1;
        String eq2;
        double st1;
        double st2;
        if (!equation.substring(0, point).contains(".")) {
            eq1 = equation.substring(0, point) + ".0";
            st1 = Double.parseDouble(eq1);
        } else {
            st1 = Double.parseDouble(equation.substring(0, point));
        }
        if (!equation.substring(point + 1).contains(".")) {
            eq2 = equation.substring(point + 1) + ".0";
            st2 = Double.parseDouble(eq2);
        } else {
            st2 = Double.parseDouble(equation.substring(point + 1));
        }
        return((Math.pow(st1, st2)));
    }
}
