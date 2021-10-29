public class Base {
    double Addition(String equation){
        int point = equation.indexOf("+");
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
        return((st1 + st2));
    }
    double Subtraction(String equation){
        int point = equation.indexOf("-");
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
        return((st1 - st2));
    }
    double Multiplication(String equation){
        int point = equation.indexOf("*");
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
        return((st1 * st2));
    }
    double Division(String equation){
        int point = equation.indexOf("/");
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
        return((st1/st2));
    }
    double Trig(String equation){
        String eq2;
        double st2;
        if (equation.contains("t")) {
            int point = equation.indexOf("t");
            if (!equation.substring(point + 1).contains(".")) {
                eq2 = equation.substring(point + 1) + ".0";
                st2 = Double.parseDouble(eq2);
            } else {
                st2 = Double.parseDouble(equation.substring(point + 1));
            }
            double rad = Math.toRadians(st2);
            return((Math.tan(st2)));
        } else if (equation.contains("s")){
            int point = equation.indexOf("s");
            if (!equation.substring(point + 1).contains(".")) {
                eq2 = equation.substring(point + 1) + ".0";
                st2 = Double.parseDouble(eq2);
            } else {
                st2 = Double.parseDouble(equation.substring(point + 1));
            }
            double rad = Math.toRadians(st2);
            return((Math.sin(st2)));
        } else if (equation.contains("c")) {
            int point = equation.indexOf("c");
            if (!equation.substring(point + 1).contains(".")) {
                eq2 = equation.substring(point + 1) + ".0";
                st2 = Double.parseDouble(eq2);
            } else {
                st2 = Double.parseDouble(equation.substring(point + 1));
            }
            double rad = Math.toRadians(st2);
            return((Math.cos(st2)));
        }
        return 0.0;
    }
}
