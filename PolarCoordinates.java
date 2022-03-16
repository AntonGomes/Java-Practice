public class PolarCoordinates {
        public static void main(String[] args){
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            double R = Math.pow((Math.pow(x, 2.0) + Math.pow(y, 2.0)), 0.5);
            double O = Math.atan2(y, x);
            System.out.println(R + "\n" + O);
        }
    }
