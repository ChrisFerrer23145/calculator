public class Extra {
    Components c = new Components();
    double SendOff(String equation, String order) {
        int i = 0;
        for(i=0;i<1;i++) {
            System.out.println(equation);
            if (order.contains("(")){
                int x = equation.indexOf("(");
                int y = equation.indexOf(")");
                String eq = equation.substring(x + 1, y);
                int inc = 0;
                String ordx = "";
                for(inc=0;inc < eq.length();inc++) {
				    ordx = c.Determine(Character.toString(eq.charAt(inc)), "");
			    }
			    System.out.println(SendOff(eq, ordx));
                equation = equation.substring(0, x) + SendOff(eq, ordx) + equation.substring(y + 1);
                System.out.println(equation);
                for(inc=0;inc < eq.length();inc++) {
				    order = c.Determine(Character.toString(eq.charAt(inc)), "");
                }
            }
        }
        order = "";
        for(i=0;i < equation.length();i++) {
			order = c.Determine(Character.toString(equation.charAt(i)), order);
		}
        equation = c.Handle(equation, order);
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
