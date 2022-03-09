public class ImQuadraticSolver {
        public static void main(String[] args){
            double A = Double.parseDouble(args[0]);
            double B = Double.parseDouble(args[1]);
            double C = Double.parseDouble(args[2]);

            double disc = Math.abs(Math.pow(B, 2.0) - (4.0 * A * C));

            System.out.println((-B)+ Math.pow(disc, 0.5)/(2*A));
            System.out.println((-B)-Math.pow(disc, 0.5)/(2*A));

        }

    }
