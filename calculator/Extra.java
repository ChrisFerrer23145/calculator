public class Extra {
    Components c = new Components();
	String Parenthesis(String equation, String order) {
			int x = equation.indexOf("(");
			int y = equation.indexOf(")");
			String check = equation.substring(x + 1, y);
			while (check.indexOf("(") != -1) {
			    x++;
			    check = equation.substring(x + 1, y);
			}
            String eq = equation.substring(x + 1, y);
            int inc = 0;
            String ordx = "";
            for(inc=0;inc < eq.length();inc++) {
			   ordx = c.Determine(Character.toString(eq.charAt(inc)), "");
			}
            equation = equation.substring(0, x) + SendOff(eq, ordx) + equation.substring(y + 1);
            return equation;
	}
	
    double SendOff(String equation, String order) {
        int i = 0;
		order = "";
        for(i=0;i < equation.length();i++) {
			order = c.Determine(Character.toString(equation.charAt(i)), order);
		}
        for(i=0;i<3;i++) {
            if (equation.contains("(")){
                equation = Parenthesis(equation, order);
				int inc = 0;
				for(inc=0;inc < equation.length();inc++) {
			    	order = c.Determine(Character.toString(equation.charAt(inc)), "");
            	}
            	i--;
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
