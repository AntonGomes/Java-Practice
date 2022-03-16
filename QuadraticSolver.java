public class QuadraticSolver{
    public static void main(String[] args){
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        double C = Double.parseDouble(args[2]);
        double thing = (Math.pow(B, 2.0)-(4.0*A*C));
        if (thing<0.0) {
            System.out.println("This quadratic has imaginary solutions!");
        }
        else {
            System.out.println(((-B + Math.pow(thing, 0.5))/(2.0*A)) + "\n" + ((-B - Math.pow(thing, 0.5))/(2.0*A)));
        }
    }
}

